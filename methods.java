public class methods {
        static int max(int x,int y) // Formal Parameters
        {
            if(x>y)
                return x;
            else
                return y;
        }

        public static void main(String[] args) {
            int a , b;
            int c = max(10,20); // actual Parameters
            System.out.println(c);
        }
}

