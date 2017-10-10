public class Main {

    public static void main(String[] args) {

        int counter = 2520;
        boolean exit = false;

        while(!exit)
        {
            for(int divcounter = 2; divcounter <= 20; divcounter++)
            {
                if( counter % divcounter == 0)
                {
                    if(divcounter == 20)
                    {
                        exit = true;
                    }
                }
                else
                {
                    break;
                }
            }

            if(!exit)
            {
                counter += 20;
            }
        }
        System.out.println(counter);
    }

}
