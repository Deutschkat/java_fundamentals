package labs_examples.multi_threading.examples;

// Use isAlive().
//class MoreThreads {
//    public static void main(String args[]) {
//        System.out.println("Main thread starting.");
//
//        MyThread4 mt1 = new MyThread4("Child #1");
//        MyThread4 mt2 = new MyThread4("Child #2");
//        MyThread4 mt3 = new MyThread4("Child #3");
//
//        do {
//            System.out.print(".");
//            try {
//                Thread.sleep(100);
//            }
//            catch(InterruptedException exc) {
//                System.out.println("Main thread interrupted.");
//            }
//        } while (mt1.thrd.isAlive() ||
//                mt2.thrd.isAlive() ||
//                mt3.thrd.isAlive());
//
//        System.out.println("Main thread ending.");
//    }
//}