import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Computation {
    public static void main(String[] args) {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        System.out.print("Enter the border: ");
        Scanner input = new Scanner(System.in);
        String border;
        char[] borderArray;
        int value_border_a = 0 ; //'('
        int value_border_b = 0 ; //')'
        //boolean[] border_check; 


        border = input.nextLine();
        if(border.length()%2!=0){
            System.out.println("Not Pass");
        }
        else{
            border.toCharArray();
            borderArray = border.toCharArray();
            boolean[] border_check = new boolean[borderArray.length]; 
            for(int i=0;i<borderArray.length;i++){
                if(borderArray[i]=='('){
                    border_check[i]=true;
                }
                else{
                    border_check[i]=false;
                }
                queue.add(borderArray[i]);
            }
            for(int i=0;i<borderArray.length;i++){
                //System.out.println(borderArray[i]);
                if(borderArray[i]=='('){
                    stack.push(borderArray[i]);
                    
                }
                /*else if(borderArray[i]==')'){
                    System.out.println(borderArray[i]);
                }*/
            }
            for(int i=0;i<borderArray.length;i++){
                if(borderArray[i]==')'){
                    stack.push(borderArray[i]);
                }

            }
            for(int i=0;i<borderArray.length;i++){
                if(stack.peek()=='('){
                    stack.pop();
                    value_border_a++;
                }
                else if(stack.peek()==')'){
                    stack.pop();
                    value_border_b++;
                }
            }
            if(value_border_a==value_border_b){
                System.out.println("Pass");
            }
        }
    }
}
