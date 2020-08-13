/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal;




import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.InputMismatchException;

import java.util.Scanner;


/**
 *
 * @author Matheus
 */
public class Menu {
    static ArrayList<Loja>instrumento = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        ArrayList<Compra>compras = new ArrayList<>();
        
        int op = 1;
        
        do{
           
                
            System.out.println("=========Menu==============");
            System.out.println("==1-Cadastra instrumentos==");
            System.out.println("==2-Cadastrar funcionario==");
            System.out.println("==3-Mostra intrumentos   ==");
            System.out.println("==4-Buscar instrumentos  ==");
            System.out.println("==5-Compra instrumentos  ==");
            System.out.println("==6-Gera boleto          ==");
            System.out.println("==7-Sair                 ==");
            System.out.println("===========================");
          
            System.out.println("Digite uma opcao: ");
            int opc = input.nextInt();
           
            switch(opc){
                case 1:
                    System.out.println("Cadastra Instrumento");
                        System.out.println("1-Guitarra\n2-Violao\n3-piano");
                        System.out.println("4-Bateria\n5-Kajon\n6-Meia Lua");
                        System.out.println("7-Trompete\n8-Flauta\n9-Ecaleta");
                        System.out.println("10-Tecaldo\n11-Acordeon\n12-Sintetizador");
                      
                        System.out.println("Digite uma opcao ");
                        int op2 = input.nextInt();
                        
                         
                     
                        String nome;
                        String modelo;
                        double preco;
                        int codigo;
                        String cpf;
                        
                      
                                
                        
                        switch(op2){
                            
                            case 1:
                                System.out.println("Guitarra");
                                   instrumento.add(new Guitarra(nome = Cadnome(), preco = Cadpreco(), 
                                            codigo = Cadcodigo(), modelo = CadMdelo()));
                                break;
                            case 2:
                                System.out.println("Violao");
                                instrumento.add(new Violao(nome = Cadnome(), preco = Cadpreco(), 
                                            codigo = Cadcodigo(), modelo = CadMdelo() ));
                               break;
                            case 3:
                                System.out.println("piano");
                                instrumento.add(new Piano(nome = Cadnome(), preco = Cadpreco(), 
                                            codigo = Cadcodigo(), modelo = CadMdelo() ));
                                break;
                            case 4:
                                System.out.println("Bateria");
                                 instrumento.add(new Bateria(nome = Cadnome(), preco = Cadpreco(), 
                                            codigo = Cadcodigo(), modelo = CadMdelo() ));
                               break;
                            case 5:
                                System.out.println("Kajon");
                                instrumento.add(new Kajon(nome = Cadnome(), preco = Cadpreco(), 
                                            codigo = Cadcodigo(), modelo = CadMdelo() ));
                                break;
                            case 6:
                                System.out.println("Meia Lua");
                                instrumento.add(new MeiaLua(nome = Cadnome(), preco = Cadpreco(), 
                                            codigo = Cadcodigo(), modelo = CadMdelo() ));
                               break;   
                            case 7:
                                System.out.println("Trompete");
                                instrumento.add(new Trompete(nome = Cadnome(), preco = Cadpreco(), 
                                            codigo = Cadcodigo(), modelo = CadMdelo() ));
                                break;
                            case 8:
                                System.out.println("Flauta");
                                instrumento.add(new Flauta(nome = Cadnome(), preco = Cadpreco(), 
                                            codigo = Cadcodigo(), modelo = CadMdelo() ));
                               break;
                            case 9:
                                System.out.println("Ecaleta");
                                instrumento.add(new Escaleta(nome = Cadnome(), preco = Cadpreco(), 
                                            codigo = Cadcodigo(), modelo = CadMdelo() ));
                                break;
                            case 10:
                                System.out.println("Tecaldo");
                                instrumento.add(new Teclado(nome = Cadnome(), preco = Cadpreco(), 
                                            codigo = Cadcodigo(), modelo = CadMdelo() ));
                               break;
                            case 11:
                                System.out.println("Acordeon");
                                instrumento.add(new Acordeon(nome = Cadnome(), preco = Cadpreco(), 
                                            codigo = Cadcodigo(), modelo = CadMdelo() ));
                                break;
                            case 12:
                                System.out.println("Sintetizador");
                                instrumento.add(new Sintetizador(nome = Cadnome(), preco = Cadpreco(), 
                                            codigo = Cadcodigo(), modelo = CadMdelo() ));
                               break;
                            default:
                                System.out.println("Opcao errada");
                                break;
                        }
                      
                    break;
                case 3:
                    
                    System.out.println("Mostra Instrumentos");
                    System.out.println("1-Mostra tudo\n2-Mostra Instrumentos Eletricos\n3-Mostra Instrumentos Arcustico");
                    System.out.println("4-Mostra Instrumentos de corda\n5-Mostra Instrumentos de percusao"
                            + "\n6- Mostra Instrumentos de Sopro\n7-Mostra Instrumentos Teclas\n8-Sair");
                  try{
                    System.out.println("Digite uma opcao: ");
                    int op3 = input.nextInt();
                     
                    
                
                    switch(op3){
                        case 1:
                            System.out.println("Mostra tudo");
                             
                                for(Loja x:instrumento){
                                   if(x instanceof Instruentos){
                                       Instruentos aux = (Instruentos)x;
                                       System.out.println(aux.toString());
                                   }
                               }

                            break;
                        case 2:
                            System.out.println("Mostra Instrumentos Eletricos");
                                     for(Loja x:instrumento){
                                           if(x instanceof Eletrico){
                                                Eletrico aux = (Eletrico)x;
                                                 System.out.println(aux.toString());
                                          }
                                     }
                            
                            break;
                         case 3:
                             System.out.println("Mostra Instrumentos Arcustico");
                             for(Loja x:instrumento){
                                           if(x instanceof Acustico){
                                                Acustico aux = (Acustico)x;
                                                 System.out.println(aux.toString());
                                          }
                                     }
                            break;
                        case 4:
                            System.out.println("Mostra Instrumentos de corda");
                             for(Loja x:instrumento){
                                           if(x instanceof Corda){
                                                Corda aux = (Corda)x;
                                                 System.out.println(aux.toString());
                                          }
                                     }
                            break;  
                         case 5:
                             System.out.println("Mostra Instrumentos de percusao");
                              for(Loja x:instrumento){
                                           if(x instanceof Percursao){
                                                Percursao aux = (Percursao)x;
                                                 System.out.println(aux.toString());
                                          }
                                     }
                            break;
                        case 6:
                            System.out.println("Mostra Instrumentos de Sopro");
                             for(Loja x:instrumento){
                                           if(x instanceof Sopro){
                                                Sopro aux = (Sopro)x;
                                                 System.out.println(aux.toString());
                                          }
                                     }
                            break;
                         case 7:
                             System.out.println("Mostra Instrumentos Teclas");
                              for(Loja x:instrumento){
                                           if(x instanceof Teclas){
                                                Teclas aux = (Teclas)x;
                                                 System.out.println(aux.toString());
                                          }
                                     }
                            break;
                        case 8:
                            System.out.println("Saindo......");
                            return; 
                            default:
                                System.out.println("Opcao invalida");
                                break;
                                
                    }
                    
                   }catch(InputMismatchException erro){
                         System.out.println("Ocorreu um erro "+erro);
                       
                   }
                    break;
                case 4:
                    System.out.println("Busca Instrumentos");
                    System.out.println("Digite o codigo do instrumento: ");
                    int auxcod = input.nextInt();
                    
                    for(Loja x: instrumento){
                        if(x instanceof Instruentos){
                            Instruentos aux = (Instruentos)x;
                            if(((Instruentos) x).getCodigo() == auxcod){
                                System.out.println("Buscar");
                                System.out.println("Produto selecionado "+ aux.getNome()+""+aux.getCodigo()
                                        +"Modelo "+aux.getModelo()+"Preco "+aux.getPreco());
                                
                                
                            }else{
                                System.out.println("Nao encontrado");
                            }
                        }
                    }
                    
                    break;
                case 5:
                    int opx =0;
                    do{
                        
                    
                    System.out.println("=============================================");
                    System.out.println("Compra instrumentos");
                    System.out.println("=============================================");
                    System.out.println("Digite o codigo do produto");
                    System.out.println("==============================================");
                    int cod = 0;
                    try{
                     cod = input.nextInt();
                     }catch(InputMismatchException erro){
                        System.out.println("Erro"+erro);
                    }
                                String nome1;
                                String modelo1;
                                int codigo1;
                                double preco1;
                    for(Loja x: instrumento){
                        if(x instanceof Instruentos){
                            Instruentos aux = (Instruentos)x;
                            if(((Instruentos) x).getCodigo() == cod){
                                System.out.println("Buscar");
                                System.out.println("Produto selecionado "+ aux.getNome()+""+aux.getCodigo());
                                 nome1 = aux.getNome();
                                 modelo1 = aux.getModelo();
                                codigo1 = aux.getCodigo();
                                preco1 = aux.getPreco();
                               
                               
                                compras.add(new Compra(nome1, modelo1, codigo1, preco1));
                               
                               
                            }
                        }
                    }
                        System.out.println("1-para de compra\n0-Contunar comprando");
                        opx = input.nextInt();
                    }while(opx !=1);
                    System.out.println("=====================================================");
                    System.out.println("Dados do comprador");
                    System.out.println("======================================================");
                    String nomec,cpfc;
                    instrumento.add(new Cliente(cpfc = CadCpf(),nomec = Cadnome()));
                    
                   
                    
                        
                    
                    
                    
                    break;
                case 6:
                    System.out.println("Boleto");
                    for(Loja x: instrumento){
                        if(x instanceof Cliente){
                            Cliente aux = (Cliente)x;
                            System.out.println("================================================");
                            System.out.println("\t\tCliente");
                            System.out.println("================================================");
                            System.out.println("Nome: "+aux.getNome()+"CPF: "+aux.getCodigo());
                            System.out.println("================================================");
                        }
                    }
                    //funcionario
                  System.out.println("Digite o CPF do Vendedor: ");
                    String cpf1 = input.next();
                            System.out.println("=================================================");
                                BuscarFuncionario(cpf1);
                            System.out.println("=================================================");
                            
                            System.out.println("\t\tCompras");
                            System.out.println("=================================================");
                             System.out.println(compras);
                            System.out.println("=================================================");
                            System.out.println("Preco total");
                            double saldoFinal = 0;
                            for(Compra x: compras){
                                saldoFinal = x.getPreco()+saldoFinal;
                            }
                            System.out.println(saldoFinal);
                            System.out.println("==================================================");
                   // LocalDateTime now = LocalDateTime.now(); 
                    
                    System.out.println("Data "+LocalDate.now());
                   
                            
                    break;
                case 2:
                    System.out.println("Funcionario");
                    String nomef,cpff;
                    instrumento.add(new Funcionario(cpff = CadCpf(),nomef = Cadnome()));
                        
                   break;
                case 7:
                     System.out.println("Saindo....");
                    return;
                    
                 default:
                     System.out.println("Digitou errado");
                     break;
            }
     
            
         }
             
        }while(op!=0);
        
       
    }


    
    //////////////////////////////////////
                static String Cadnome(){
                    
                    String nome;
                    System.out.println("Digite um nome: ");
                 
                      nome = input.next();
                    
                   
                    return nome;
                }

                 static double Cadpreco(){
                    double preco = 0;
                    try{
                    System.out.println("Digite um preco: ");
                    preco = input.nextDouble();
                    }catch(InputMismatchException erro){
                        System.out.println("Erro"+erro);
                    }
                    return preco;
                }

                  static int Cadcodigo(){
                    int codigo = 0;
                    try{
                    System.out.println("Digite um codigo: ");
                    codigo = input.nextInt();
                     }catch(InputMismatchException erro){
                        System.out.println("Erro"+erro);
                    }
                    return codigo;
                }

                   static String CadMdelo(){
                    String modelo;
                    System.out.println("Digite um modelo: ");
                    modelo = input.next();
                    return modelo;
                }
                   
                     static String CadCpf(){
                    String cpf;
                    System.out.println("Digite o cpf: ");
                    cpf = input.next();
                    return cpf;
                }
                     
                static void BuscarFuncionario(String cpf ){
                    for(Loja x: instrumento){
                        if(x instanceof Funcionario){
                          Funcionario aux = (Funcionario)x;
                          if(aux.getCodigo().equals(cpf)){
                              System.out.println("Nome :"+aux.getNome()+" CPF: "+aux.getCodigo());
                              
                          }else{
                              System.out.println("Funcionario nao exite");
                           
                          }
                        }
                    }
                }
                
                
}
