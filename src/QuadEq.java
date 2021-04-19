public class QuadEq {

//    public class Myresult{
//        private double first;
//        private double second;
//
//        public Myresult(double first, double second){
//            this.first = first;
//            this.second = second;
//        }
//        public double getFirst(){
//            return first;
//        }
//        public double getSecond(){
//            return second;
//        }
//    }
    public double roots (double a, double b, double c ){
        double d = b*b - 4*a*c;
        if (d>0){
            double x1, x2;
            x1 = (-b - Math.sqrt(d))/(2*a);
            x2 = (-b + Math.sqrt(d))/(2*a);
            return x1+x2;
        }
        else if (d == 0){
            double x = -b/(2*a) ;
            return x;
        }
        else{
            return '!';
        }
    }

}
