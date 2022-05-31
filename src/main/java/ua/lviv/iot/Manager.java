package ua.lviv.iot;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Manager  {
    Stadium[] urod;
    public Manager(Stadium[] chmo){
        this.urod=chmo;
    }

    public Stadium[] getUrod() {
        return urod;
    }

    Comparator WhitePowerComparator = Comparator.comparing(Stadium::getWhitePower);
    Comparator WatchmenComparator = Comparator.comparing(Stadium::getWatchmen);
    public Stadium[] sortArraybyWhitePower(){
        Arrays.sort(getUrod(), WhitePowerComparator);
        return urod;
    }
    public Stadium[] sortArraybyWatchmen(){
        Arrays.sort(getUrod(), WatchmenComparator);
        return urod;
    }
    public Stadium[] sortArraybyWhitePowerR(){
        Arrays.sort(getUrod(), WhitePowerComparator.reversed());
        return urod;
    }
    public Stadium[] sortArraybyWatchmenR(){
        Arrays.sort(getUrod(), WatchmenComparator.reversed());
        return urod;
    }
    public Stadium findUsingEnhancedForLoop(double toFind ) {
        for (Stadium stadium : getUrod()) {
            if (stadium.getWhitePower() == toFind) {
                System.out.println(stadium.toString());
            }
            return null;
        }
        return null;
    }
    public void printArray(){
        for (int i = 0; i < getUrod().length; i++) {
            System.out.println(getUrod()[i].toString());
        }
        System.out.println();
    }
}
