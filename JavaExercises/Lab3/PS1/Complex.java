/* Sa se dezvolte clasa Complex ce are ca variabile de instanta
doua numere intregi re si im(partea reala si partea imaginara a
unui numar complex) si ca metode:
- constructorul
- modul(), ce returneaza modulul unui numar complex
- suma(), ce are ca parametru un numar complex c, prin care numarul
curent se aduna cu numarul c
- produs(), ce are ca parametru un numar complex c, prin care in
numarul complex curent se depune rezultatul inmnultirii dintre 
numarul complex curent si numarul c
- getRe(), ce returneaza parte reala
- getIm(), ce returneaza partea imaginara
- egale(), prin care se compara din punct de vedere al continutului
doua obiecte Complex: obiectul curent si obiectul dat ca parametru
Scrieti si o clasa de test pentru clasa Complex.*/

package JavaExercises.Lab3.PS1;

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
}
