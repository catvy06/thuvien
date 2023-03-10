//package thuvien;
//
//import java.io.*;
//import java.util.Scanner;
//
//import static thuvien.WriteFile.pathFile;
//
//    public class Library {
//        public void addBook(){
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter id: ");
//            int id = scanner.nextInt();
//            scanner.nextLine();
//            System.out.print("Enter title: ");
//            String title = scanner.nextLine();
//            System.out.print("Enter author: ");
//            String author = scanner.nextLine();
//            System.out.print("Enter publisher: ");
//            String publisher = scanner.nextLine();
//            System.out.println("Enter quantity: ");
//            int quantity = scanner.nextInt();
//            scanner.nextLine();
//            boolean borrowed = false;
//
//            Book book1 = new Book(id,title,author,publisher,quantity,borrowed);
//
//            try {
//                File file = new File(pathFile("Books.txt"));
//                FileWriter fileWriter = new FileWriter(file,true);
//                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//                if (file.length()==0){
//                    bufferedWriter.write(book1.getId() + "," + book1.getTitle() + "," + book1.getAuthor()
//                            + "," + book1.getPublisher() + "," + book1.getQuantity() + "," + book1.isBorrowed());
//                    bufferedWriter.close();
//                    fileWriter.close();
//                    System.out.println("Book added successfully.");
//                } else {
//                    bufferedWriter.newLine();
//                    bufferedWriter.write(book1.getId() + "," + book1.getTitle() + "," + book1.getAuthor()
//                            + "," + book1.getPublisher() + "," + book1.getQuantity());
//                    bufferedWriter.close();
//                    fileWriter.close();
//                    System.out.println("Book added successfully.");
//                }
//            } catch (IOException e){
//                throw new RuntimeException("Fail! ");
//            }
//        }
//
//        public void updateBook(Book book){
//            try {
//                File file = new File(pathFile("Books.txt"));
//                FileReader fileReader = new FileReader(file);
//                BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//                File temp = new File(pathFile("temp.txt"));
//                FileWriter fileWriter = new FileWriter(temp);
//                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//
//                String line;
//                while ((line = bufferedReader.readLine()) != null){
//                    String[] bookData = line.split(",");
//                    if (Integer.parseInt(bookData[0])==book.getId()){
//                        line = book.getId() + "," + book.getTitle() + "," + book.getAuthor() + "," + book.getPublisher()
//                        + "," + book.getQuantity() + "," + book.isBorrowed();
//                    }
//                    bufferedWriter.write(line);
//                    bufferedWriter.newLine();
//                }
//                bufferedWriter.close();
//                bufferedReader.close();
//
//                if (!file.delete()){
//                    System.out.println("Failed to delete the file");
//                }
//
//                if (!temp.renameTo(file)){
//                    System.out.println("Failed to rename the file");
//                }
//            } catch (Exception e) {
//                System.out.println("Error: " + e.getMessage());
//            }
//        }
//
//        public void delete(int id){
//            try {
//                File file = new File(pathFile(""));
//                FileReader fileReader = new FileReader(file);
//                BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//                File temp = new File(pathFile("temp.txt"));
//                FileWriter fileWriter = new FileWriter(temp);
//                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//
//                String line;
//                while ((line = bufferedReader.readLine())!=null){
//                    String[] delete = line.split(",");
//                    if (Integer.parseInt(delete[0])==id){
//                        continue;
//                    }
//                    bufferedWriter.write(line);
//                    bufferedWriter.newLine();
//                }
//                bufferedWriter.close();
//                bufferedReader.close();
//                if (!file.delete()){
//                    System.out.println("Failed to delete the file");
//                }
//
//                if (!temp.renameTo(file)){
//                    System.out.println("Failed to rename the file");
//                }
//            } catch (Exception e){
//                System.out.println("Error: " + e.getMessage());
//            }
//        }
//
//
////        public void deleteBook(int bookId){
////            try {
////                File file = new File(pathFile("Books.txt"));
////                FileReader fileReader = new FileReader(file);
////                BufferedReader bufferedReader = new BufferedReader(fileReader);
////
////                File temp = new File(pathFile("temp.txt"));
////                FileWriter fileWriter = new FileWriter(temp);
////                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
////
////                String line;
////                while ((line = bufferedReader.readLine())!=null){
////                    String[] deleteBook = line.split(",");
////                    if (Integer.parseInt(deleteBook[0])==bookId){
////                        continue;
////                    }
////                    bufferedWriter.write(line);
////                    bufferedWriter.newLine();
////                }
////                bufferedWriter.close();
////                bufferedReader.close();
////                if (!file.delete()){
////                    System.out.println("Failed to delete the file");
////                }
////
////                if (!temp.renameTo(file)){
////                    System.out.println("Failed to rename the file");
////                }
////
////                System.out.println("Delete book successfully!");
////            } catch (Exception e){
////                System.out.println("Error: " + e.getMessage());
////            }
////        }
//
//        public void addAuthor(){
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter id: ");
//            int id = scanner.nextInt();
//            scanner.nextLine();
//            System.out.print("Enter name: ");
//            String name = scanner.nextLine();
//
//            Author author = new Author(id,name);
//            try {
//                File file = new File(pathFile("Author.txt"));
//                FileWriter fileWriter = new FileWriter(file,true);
//                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//                if (file.length()==0){
//                    bufferedWriter.write(author.getId() + "," + author.getName());
//                    bufferedWriter.close();
//                    fileWriter.close();
//                    System.out.println("Author added successfully.");
//                } else {
//                    bufferedWriter.newLine();
//                    bufferedWriter.write(author.getId() + "," + author.getName());
//                    bufferedWriter.close();
//                    fileWriter.close();
//                    System.out.println("Author added successfully.");
//                }
//            } catch (IOException e){
//                throw new RuntimeException("Fail! ");
//            }
//        }
//
//        public void updateAuthor(Author author){
//            try {
//                File file = new File(pathFile("Author.txt"));
//                FileReader fileReader = new FileReader(file);
//                BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//                File temp = new File(pathFile("temp.txt"));
//                FileWriter fileWriter = new FileWriter(temp);
//                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//
//                String line;
//                while ((line = bufferedReader.readLine()) != null){
//                    String[] authorData = line.split(",");
//                    if (Integer.parseInt(authorData[0])==author.getId()){
//                        line = author.getId() + "," + author.getName();
//                    }
//                    bufferedWriter.write(line);
//                    bufferedWriter.newLine();
//                }
//                bufferedWriter.close();
//                bufferedReader.close();
//
//                if (!file.delete()){
//                    System.out.println("Failed to delete the file");
//                }
//
//                if (!temp.renameTo(file)){
//                    System.out.println("Failed to rename the file");
//                }
//            } catch (Exception e) {
//                System.out.println("Error: " + e.getMessage());
//            }
//        }
//
//        public void addMember(){
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter id: ");
//            int id = scanner.nextInt();
//            scanner.nextLine();
//            System.out.println("Enter name: ");
//            String name = scanner.nextLine();
//            System.out.println("Enter address: ");
//            String address = scanner.nextLine();
//            System.out.println("Enter phone: ");
//            String phone = scanner.nextLine();
//            System.out.println("Enter email: ");
//            String email = scanner.nextLine();
//
//            Member member = new Member(id,name,address,phone,email);
//            try {
//                File file = new File(pathFile("Member.txt"));
//                FileWriter fileWriter = new FileWriter(file,true);
//                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//                if (file.length() == 0){
//                    bufferedWriter.write(member.getId() + "," + member.getName() + ","
//                            + member.getAddress() + "," + member.getPhone() + "," + member.getEmail());
//                    bufferedWriter.close();
//                    fileWriter.close();
//                    System.out.println("Member added successfully.");
//                } else {
//                    bufferedWriter.newLine();
//                    bufferedWriter.write(member.getId() + "," + member.getName() + ","
//                            + member.getAddress() + "," + member.getPhone() + "," + member.getEmail());
//                    bufferedWriter.close();
//                    fileWriter.close();
//                    System.out.println("Member added successfully.");
//                }
//            } catch (IOException e){
//                throw new RuntimeException("Fail! ");
//            }
//        }
//
//        public void updateMember(Member member){
//            try {
//                File file = new File(pathFile("Member.txt"));
//                FileReader fileReader = new FileReader(file);
//                BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//                File temp = new File(pathFile("temp.txt"));
//                FileWriter fileWriter = new FileWriter(temp);
//                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//
//                String line;
//                while ((line = bufferedReader.readLine()) != null){
//                    String[] memberData = line.split(",");
//                    if (Integer.parseInt(memberData[0])== member.getId()){
//                        line = String.valueOf(member.getId()) + "," + member.getName() + ","
//                                + member.getAddress() + "," + member.getPhone() + "," + member.getEmail();
//                    }
//                    bufferedWriter.write(line);
//                    bufferedWriter.newLine();
//                }
//                bufferedWriter.close();
//                bufferedReader.close();
//
//                if (!file.delete()){
//                    System.out.println("Failed to delete the file");
//                }
//
//                if (!temp.renameTo(file)){
//                    System.out.println("Failed to rename the file");
//                }
//            } catch (Exception e){
//                System.out.println("Error: " + e.getMessage());
//            }
//        }
//
//        public Book searchBookById(int id){
//            Book book = null;
//            try {
//                FileReader file = new FileReader(pathFile("Books.txt"));
//                Scanner scanner = new Scanner(file);
//
//                while (scanner.hasNextLine()) {
//                    String line = scanner.nextLine();
//                    String[] bookData = line.split(",");
//                    if (Integer.parseInt(bookData[0])==id) {
//                        return new Book(Integer.parseInt(bookData[0]), bookData[1], bookData[2], bookData[3],Integer.parseInt(bookData[4]),Boolean.parseBoolean(bookData[5]));
//                    }
//                }
//                scanner.close();
//            } catch (Exception e) {
//                System.out.println("Error: " + e.getMessage());
//            }
//            return null;
//        }
//
//        public Member searchMemberById(int id){
//            Member member = null;
//            try {
//                FileReader file = new FileReader(pathFile("Member.txt"));
//                Scanner scanner = new Scanner(file);
//
//                while (scanner.hasNextLine()){
//                    String line = scanner.nextLine();
//                    String[] memberData = line.split(",");
//                    if (Integer.parseInt(memberData[0])==id){
//                        return new Member(Integer.parseInt(memberData[0]),memberData[1],memberData[2],memberData[3],memberData[4]);
//                    }
//                }
//            } catch (Exception e) {
//                System.out.println("Error: " + e.getMessage());
//            }
//            return null;
//        }
//
//        public void addBorrow(int dateBorrow, int bookId, int memberId){
//            Book book = new Book();
//            book = searchBookById(bookId);
//            Book[] data = null;
//            data[0] = book;
//        }
//    }
