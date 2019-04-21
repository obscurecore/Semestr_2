import java.util.Comparator;

public class ListP {
    //массив упорядоченных треков
    Pup[] listOf;
    int n = 5;
    Comparator<Pup> comparator;

    public ListP(int size) {
        this.listOf = new Pup[size];
    }

    public ListP(int size, Comparator<Pup> comparator) {
        this(size);
        this.comparator = comparator;
    }

    //вставляет новый аудиотрек в нужное место согласно порядку
    public void add(Pup person) {
        //если передали при создании PlayList компаратор,
        //то сравниваем с пом. компаратора, а если нет,
        //то сравниваем через comparator
        if (comparator == null) {
            for (int i = 0; i < listOf.length; i++) {
                //if (person.compareTo(listOf[i]) > 0) {
                    if(listOf[i]!=null){
                        if (person.compareTo(listOf[i]) < 0) {
                            Pup qw = listOf[i];
                            listOf[i] = person;
                            listOf[i+1]=qw;
                            break;
                        }

                        else {
                            listOf[i+1]=person;
                        }
                    }
                    if (listOf[0] == null) {
                        listOf[0]=person;
                    }
                }
            //}
        } else {
            for (int i = 0; i < listOf.length; i++) {
                //if (comparator.compare(person, listOf[i]) > 0) {
                    if(listOf[i]!=null){
                        if (person.compareTo(listOf[i]) < 0) {
                            Pup qw = listOf[i];
                            listOf[i] = person;
                            listOf[i+1]=qw;
                            break;
                        }

                        else {
                            listOf[i+1]=person;
                        }
                    }
                    if (listOf[0] == null) {
                        listOf[0]=person;
                    }
                }
            }
        //}
        //n++;

    }
    public  void view () {
        for (int i = 0; i <listOf.length ; i++) {
            if (listOf[i]!=null) {
                System.out.println(listOf[i].getId());
            }
        }
    }
}

