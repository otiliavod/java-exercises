/* Sa se adauge in clasa Complex metoda complexConjugat() care 
returneaza numarul complex conjugat al numarului curent.*/

package JavaExercises.Lab3.P1;

public class CompexAddition {

    public class Complex {
        private double re;
        private double im;
    
        public Complex(double x, double y) {
            re = x;
            im = y;
        }
    
        public double getRe() {
            return re;
        }
    
        public double getIm() {
            return im;
        }
    
        public double modul() {
            return Math.sqrt(re * re + im * im);
        }
    
        public void suma(Complex c) {
            re = re + c.re;
            im = im + c.im;
        }
    
        public void produs(Complex c) {
            re = re * c.re - im * c.im;
            im = re * c.im + im * c.re;
        }
    
        public boolean egale(Complex c) {
            if((re == c.re) && (im == c.im)) {
                return true;
            }
            else {
                return false;
            }
        }

        
    // Class Complex Addition:
    public double complexConjugat(Complex c) {
        re = c.re;
        im = -c.im;
        return re + im;
    }
}
}
