class Unary
{
    public static void main(String[] args) {
        
        // ++pre,--pre, Post++, post--

        int a = 10;
        int b = a++ + ++a - a-- + --a ;
              
        System.out.println(a); //10
        System.out.println(b); //20

    }
}