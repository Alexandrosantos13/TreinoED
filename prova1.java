import java.util.*;
import java.util.LinkedList;
public class prova1 {
    public static void main (String[] args) {
        List<Object> list1 = new ArrayList<>();
        List<Object> list2 = new ArrayList<>();
        Collections.addAll(list1, 1, 2, 3, 4, 5);
        Collections.addAll(list2, 3, 4, 5, 6, 7);
        Scanner sc = new Scanner(System.in);
        
        
        while (true) {
            
            
            System.out.println("\n--- MENU ---");
            System.out.println("Adicionar a lista 1: Digite 1");
            System.out.println("Adicionar a lista 2: Digite 2");
            System.out.println("Ver resultado da Interseção: Digite 3");
            System.out.println("Sair: Digite 0");

            int switchChoice = sc.nextInt(); 

            switch (switchChoice) {
                case 1:
                    System.out.println("Digite o valor para add na lista 1");
                    list1.add(sc.next());
                    clearScreen(); 
                    break;
                case 2:
                    System.out.println("Digite o valor para add na lista 2");
                    list2.add(sc.next());
                    clearScreen(); 
                    break;
                case 3:
                    Object[] ex = letraA(list1, list2);
                    System.out.println("Resultado: " + Arrays.toString(ex));
                    System.out.println("Pression3e Enter para continuar...");
                    sc.next(); 
                    sc.nextLine(); 
                    break;
                    case 4:
                    Object[] ex2 = letraB(list1, list2);
                    System.out.println("Resultado: " + Arrays.toString(ex2));
                    System.out.println("Pression3e Enter para continuar...");
                    sc.next(); 
                    sc.nextLine(); 
                    break;
                case 0:
                    System.out.println("Saindo...");
                    sc.close();
                    return; 
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
    
    public static <T> Object[] letraA(List <T> list1, List <T> list2){
        List <T> temp = new LinkedList<>();
        for (int i =0; i<list1.size(); i++){
            boolean isequal = false;
            boolean alreadyhave=false;
            for (int j = 0; j<list2.size();j++){
                    isequal=Objects.equals(list1.get(i),list2.get(j));
                    alreadyhave=temp.contains(list1.get(i));
                    if (isequal ||alreadyhave){
                        break;
                }
            }
            if (!isequal&&!alreadyhave){
                temp.add(list1.get(i));
            }
        }
        return temp.toArray(new Object [0]);
    }
        public static <T> Object[] letraB(List <T> list1, List <T> list2){
        List <T> temp = new LinkedList<>();
        for (int i =0; i<list1.size(); i++){
            boolean isequal = false;
            boolean alreadyhave=false;
            for (int j = 0; j<list2.size();j++){
                    isequal=Objects.equals(list1.get(i),list2.get(j));
                    alreadyhave=temp.contains(list1.get(i));
                    if (isequal ||alreadyhave){
                        break;
                }
            }
            if (!isequal&&!alreadyhave){
                temp.add(list1.get(i));
            }
        }
        for (int j =0; j<list1.size(); j++){
            boolean isequal = false;
            boolean alreadyhave=false;
            for (int i = 0; i<list2.size();i++){
                    isequal=Objects.equals(list2.get(j),list1.get(i));
                    alreadyhave=temp.contains(list2.get(j));
                    if (isequal ||alreadyhave){
                        break;
                }
            }
            if (!isequal&&!alreadyhave){
                temp.add(list2.get(j));
            }
        }
        
        return temp.toArray(new Object [0]);
}
public static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}