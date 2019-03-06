package labs_examples.objects_classes_methods.examples;

class Pwr_10 {
    double b;
    int e;
    double pwr;

    Pwr_10(double base, int exp) {
        this.b = base;
        this.e = exp;

        this.pwr = 1;
        if(exp == 0)
            return;
        for( ; exp > 0; exp--)
            this.pwr = this.pwr * base;
    }

    double get_pwr() {
        return this.pwr;
    }
}


