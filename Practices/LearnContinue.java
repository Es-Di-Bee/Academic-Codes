class LearnContinue
{
    public static void main(String[] args)
    {
        int c=1;
        while(c<=6)
        {
            System.out.print(c+"hi ");
            if(c==3)
            {
                c=5;
                System.out.println();
                continue;
            }
            System.out.println("bye");
            ++c;
        }
    }
}