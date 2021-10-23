

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       List<Contact> list = new ArrayList<>();
       Scanner scanner = new Scanner(System.in);
       System.out.println("Для вывода контактов нажмите 1 : ");
       System.out.println("Для добавления контакта нажмите 2 : ");
       System.out.println("Для удаления контакта нажмите 3 : ");
       System.out.println("Для нахождения  контакта по номеру телефона нажмите 4 : ");
       System.out.println("Для выхода из программы нажмите 5 : ");
       Contact contact1 = new Contact("Andrey","Makarov",333224852,"Lif");
       Contact contact2 = new Contact("Vlad","Zhuravlev",297431233,"number");
       Contact contact3 = new Contact("Roma","Stoleriav",297431223,"Plas");
        list.add(contact1);
        list.add(contact2);
        list.add(contact3);
        boolean string = true;
        while (string){
            int a = scanner.nextInt();

            if(a==1){
                for (int i = 0; list.size()>i;i++){
                    System.out.println(list.get(i));
                }
        }
            if(a==3){
                System.out.println("Введите номер пользователя для удаления контакта : ");
                int b = scanner.nextInt();

                for(int i = 0; list.size()>i;i++){
                    if(b==list.get(i).getNumber()){
                        list.remove(i);
                        break;
                    }
                    if(b!=list.get(i).getNumber()){
                        System.out.println("Не существует контакт");
                        break;
                    }
                }
                for (int i = 0; list.size()>i;i++){
                System.out.println(list.get(i));}
            }
            if (a==2){
                Scanner localScanner = new Scanner(System.in);
                System.out.println("Введите пользователя для добавления : ");
                System.out.print(" Имя контакта : ");
                String name= localScanner.nextLine();
                System.out.print(" Фамилия контакта : ");
                String surname = localScanner.nextLine();
                System.out.print(" Заметка контакта : ");
                String note =localScanner.nextLine();
                System.out.print(" Номер контакта : ");
                int number = localScanner.nextInt();

                Contact contact4 = new Contact(name,surname,number,note);
                list.add(contact4);
                for (int i = 0; list.size()>i;i++){
                    System.out.println(list.get(i));}
            }

            if(a==4){
                System.out.println(" Введите номер телефона : ");
                int number = scanner.nextInt();
                for(int i = 0; list.size()>i;i++){
                    if(number==list.get(i).getNumber()){
                        System.out.println(list.get(i));
                    }

                }

        }
            if(a==5){
                string=false;
            }

            }
        }



   }

