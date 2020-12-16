import java.io.*;
import java.util.*;
public class Main  {
    public static void main(String args[]) {
      
      ArrayList<Movie> l=new ArrayList<Movie>();
      l.add(new Movie(1,"A",1991));
      l.add(new Movie(4,"D",1992));
      l.add(new Movie(2,"F",1994));
      l.add(new Movie(3,"C",1993));
      Collections.sort(l);
      l.stream().forEach(s->System.out.println(s.getId()));
      
      YearSort yearsort=new YearSort();
      Collections.sort(l,yearsort);
       l.stream().forEach(s->System.out.println("=>"+s.getId()));
    }
}

class Movie implements Comparable<Movie>{
    int id;
    String name;
    int year;
    
    
    public int compareTo(Movie m)
    {
        return this.name.compareTo(m.name); // for String we use like this
    }
    
    Movie(int id,String name,int year)
    {
        this.id=id;
        this.name=name;
        this.year=year;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    public int getYear(){
        return year;
    }
}

class YearSort implements Comparator<Movie>
{
    public int compare(Movie m1,Movie m2){
        return m1.year-m2.year;
    }
}