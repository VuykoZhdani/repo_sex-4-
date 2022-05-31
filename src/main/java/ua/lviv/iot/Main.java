package ua.lviv.iot;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
    public class Main  {
        public static void main(String [] args)
        {
            Arena arena1=new Arena(40, 34.69);
            Coliseum coliseum1=new Coliseum(56, 97);
            Arena arena2=new Arena(20, 64.69);
            Coliseum coliseum2=new Coliseum(76, 97);
            Arena arena3=new Arena(41, 54.69);
            Coliseum coliseum3=new Coliseum(26, 1007);

            Stadium[] chmo={
                    arena1,coliseum1,arena2,coliseum2,arena3,coliseum3
            };
            Manager Yacock=new Manager(chmo);
            Yacock.sortArraybyWatchmen();
            Yacock.printArray();
            Yacock.sortArraybyWhitePower();
            Yacock.printArray();
            Yacock.sortArraybyWatchmenR();
            Yacock.printArray();
            Yacock.sortArraybyWhitePowerR();
            Yacock.printArray();
            Yacock.findUsingEnhancedForLoop(1007);
        }
    }


