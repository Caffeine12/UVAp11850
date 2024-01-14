import java.util.ArrayList;
import java.util.*;   
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> distanceArrayList = new ArrayList();
        int line = sc.nextInt();
        int flag=1,i=0;

        while(line!=0)
        {
            while(line>0)
            {
                distanceArrayList.add(sc.nextInt());                
                line--;
            }

            Collections.sort(distanceArrayList);

            for(i=1;i<distanceArrayList.size();i++)
            {
                if(i==distanceArrayList.size()-1)
                {
                    if((distanceArrayList.get(i)-distanceArrayList.get(i-1))>200)
                    {
                        flag=0;
                    }
                    else if((1422-distanceArrayList.get(i))>100)
                    {
                        flag=0;
                    }

                }
                else
                {
                    if((distanceArrayList.get(i)-distanceArrayList.get(i-1))>200)
                    {
                        flag=0;
                    }
                }
            }  
            
            if(flag==0)
            System.out.println("IMPOSSIBLE");
            else
            System.out.println("POSSIBLE");

            distanceArrayList.clear();
            flag=1;
            line= sc.nextInt();
        } 
    }
}
