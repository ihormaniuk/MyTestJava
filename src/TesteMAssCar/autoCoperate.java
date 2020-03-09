//package TesteMAssCar;
//
//import java.util.Comparator;
//
//public class autoCoperate implements Comparator<Auto> {
////    public int compare(Auto p1, Person p2)
////    {
////        // Assume no nulls, and simple ordinal comparisons
////
////        // First by campus - stop if this gives a result.
////        int campusResult = p1.getCampus().compareTo(p2.getCampus());
////        if (campusResult != 0)
////        {
////            return campusResult;
////        }
////
////        // Next by faculty
////        int facultyResult = p1.getFaculty().compareTo(p2.getFaculty());
////        if (facultyResult != 0)
////        {
////            return facultyResult;
////        }
////
////        // Finally by building
////        return p1.getBuilding().compareTo(p2.getBuilding());
////    }
//
//    @Override
//    public int compare(Auto o1, Auto o2) {
//        // Assume no nulls, and simple ordinal comparisons
//
//        // First by campus - stop if this gives a result.
//        int campusResult = o1.getNumbersOfHorsePower()(o2.getNumbersOfHorsePower());
//        if (campusResult != 0)
//        {
//            return campusResult;
//        }
//
//        // Next by faculty
//        int facultyResult = p1.getFaculty().compareTo(p2.getFaculty());
//        if (facultyResult != 0)
//        {
//            return facultyResult;
//        }
//
//        // Finally by building
//        return p1.getBuilding().compareTo(p2.getBuilding());
//    }
////    public static Comparator<Auto> SORT = new Comparator<Auto>() {
////        @Override
////        public int compare(Auto a1, Auto a2) {
////            int i = a1.toString().compareTo(a2.toString());
////            if (i == 0) {
////                i = a1.getYearRelease() - a2.getYearRelease();
////            }
////            return i;
////        }
////    };
//}
