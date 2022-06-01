import java.util.Comparator;

public class sorttbtang implements Comparator<Sinhvien> {

    @Override
    public int compare(Sinhvien o1, Sinhvien o2) {
        if (o1.getDiemtb() > o2.getDiemtb()){
            return 1;
        }else
            return -1;
    }
}
