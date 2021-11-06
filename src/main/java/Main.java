

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       List<Contact> list = new ArrayList<>();
       Scanner scanner = new Scanner(System.in);

       Contact contact1 = new Contact("Andrey", "Makarov", 23, "Lif");
       Contact contact2 = new Contact("Vlad", "Zhuravlev", 19, "number");
       Contact contact3 = new Contact("Roma", "Stoleriav", 18, "Plas");
       Contact contact4 = new Contact("Roma4", "Stoleriav", 64, "Plas");
       Contact contact5 = new Contact("Roma1", "Stoleriav", 34, "Plas");
       Contact contact6 = new Contact("Roma7", "Stoleriav", 26, "Plas");
       list.add(contact1);
       list.add(contact2);
       list.add(contact3);
       list.add(contact4);
       list.add(contact5);
       list.add(contact6);
       boolean string = true;
       while (string) {
           System.out.println("Для вывода контактов нажмите 1 : ");
           System.out.println("Для добавления контакта нажмите 2 : ");
           System.out.println("Для удаления контакта нажмите 3 : ");
           System.out.println("Для нахождения  контакта по номеру телефона нажмите 4 : ");
           System.out.println("Для выхода из программы нажмите 5 : ");

           int a = scanner.nextInt();
           switch (a){
               case 1:for (int i = 0; list.size() > i; i++) {
                   System.out.println(list.get(i));
               }
               break;
               case 2:  Scanner localScanner = new Scanner(System.in);
                   System.out.println("Введите пользователя для добавления : ");
                   System.out.print(" Имя контакта : ");
                   String name = localScanner.nextLine();
                   System.out.print(" Фамилия контакта : ");
                   String surname = localScanner.nextLine();
                   System.out.print(" Заметка контакта : ");
                   String note = localScanner.nextLine();
                   System.out.print(" Номер контакта : ");
                   int number = localScanner.nextInt();

                   Contact contact20 = new Contact(name, surname, number, note);
                   list.add(contact20);
                   for (int i = 0; list.size() > i; i++) {
                       System.out.println(list.get(i));
                   }
                   break;
               case 3:System.out.println("Введите номер пользователя для удаления контакта : ");
                   int b = scanner.nextInt();
                   int c = list.size();

                   for (int i = 0; list.size() > i; i++) {
                       if (b == list.get(i).getNumber()) {
                           list.remove(i);
                           break;
                       }

                   }

                   if (c == list.size()) {
                       System.out.println("Не существует контакта");
                   }


                   for (int i = 0; list.size() > i; i++) {

                       System.out.println(list.get(i));
                   }
                   break;
               case 4: System.out.println(" Введите номер телефона : ");
                   int number1 = scanner.nextInt();
                   boolean flag = true;
                   for (int i = 0; list.size() > i; i++) {
                       if (number1 == list.get(i).getNumber()) {
                           System.out.println(list.get(i));
                           flag=false;
                       }

                   }

                   if(flag){
                       System.out.println("Контакт с номером xxxxxxxxxx не найден" );}
                   break;
               case 5: string = false;
                   break;
               default:
                   System.out.println("Не существует такого числа ");
           }

//           if(5<=a){
//               System.out.println("Введи другое число");
//           }


//           if (a == 1) {
//               for (int i = 0; list.size() > i; i++) {
//                   System.out.println(list.get(i));
//               }
//
//           }

//           if (a == 3) {
//               System.out.println("Введите номер пользователя для удаления контакта : ");
//               int b = scanner.nextInt();
//               int c = list.size();
//
//               for (int i = 0; list.size() > i; i++) {
//                   if (b == list.get(i).getNumber()) {
//                       list.remove(i);
//                       break;
//                   }
//
//               }
//
//               if (c == list.size()) {
//                   System.out.println("Не существует контакта");
//               }
//
//
//               for (int i = 0; list.size() > i; i++) {
//
//                   System.out.println(list.get(i));
//               }
//           }


//               if (a == 2) {
//                   Scanner localScanner = new Scanner(System.in);
//                   System.out.println("Введите пользователя для добавления : ");
//                   System.out.print(" Имя контакта : ");
//                   String name = localScanner.nextLine();
//                   System.out.print(" Фамилия контакта : ");
//                   String surname = localScanner.nextLine();
//                   System.out.print(" Заметка контакта : ");
//                   String note = localScanner.nextLine();
//                   System.out.print(" Номер контакта : ");
//                   int number = localScanner.nextInt();
//
//                   Contact contact20 = new Contact(name, surname, number, note);
//                   list.add(contact20);
//                   for (int i = 0; list.size() > i; i++) {
//                       System.out.println(list.get(i));
//                   }
//               }

//               if (a == 4) {
//                   System.out.println(" Введите номер телефона : ");
//                   int number = scanner.nextInt();
//                   boolean flag = true;
//                   for (int i = 0; list.size() > i; i++) {
//                       if (number == list.get(i).getNumber()) {
//                           System.out.println(list.get(i));
//                           flag=false;
//                       }
//
//                   }
//
//                   if(flag){
//                       System.out.println("Контакт с номером xxxxxxxxxx не найден" );}
//               }
//               if (a == 5) {
//                   string = false;
//               }



       }
   }
   }







