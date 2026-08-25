public class LinkedListPalindrome {
    public static void main(String[] args){
         Node first = new Node(1);
         Node second = new Node(2);
            Node third = new Node(3);
        Node fourth = new Node(2);
            
          first.next= second;
          second.next= third;
            third.next= fourth;

            int arr[] = new int[4];
            Node current = first;
            int i = 0;

            while(current !=  null){
                arr[i] = current.data;
                current = current.next;
            

            }

            boolean isPalindrome = true;
            for(int left = 0, right = arr.length - 1; left < right; left++, right--){
                if(arr[left] != arr[right]){
                    isPalindrome = false;
                    break;
                }
            }
            if(isPalindrome){
                System.out.println("The linked list is a palindrome.");
            } else {
                System.out.println("The linked list is not a palindrome.");
            }
    }
}
