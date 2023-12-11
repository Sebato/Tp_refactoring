package org.example.Extract_Interface.resultat_attendu;

public class Global {
    public static class ListeChainee implements IListe, IGetter, IQueue{
        public boolean add(Object o) {
            return true;
        }

        public boolean isEmpty() {
            return true;
        }

        public Object get(int i) {
            return null;
        }

        public Object peek() {
            return null;
        }

        public Object poll() {
            return null;
        }

        private void secretLC() {
        }
    }

    public static class ListeTableau implements IListe, IGetter{
        public boolean add(Object o) {
            return true;
        }

        public boolean isEmpty() {
            return true;
        }

        public Object get(int i) {
            return null;
        }

        private void secretLT() {
        }

        public static void staticLT() {
        }

        int nbLT;
    }

    public static class QueueAvecPriorite implements IQueue, IListe{
        public boolean add(Object o) {
            return true;
        }

        public boolean isEmpty() {
            return true;
        }

        public Object peek() {
            return null;
        }

        public Object poll() {
            return null;
        }

        public Object comparator() {
            return null;
        }

        private void secretQAP() {
        }
    }

    public static class QueueDoubleEntree implements IQueue, IListe{
        public boolean add(Object o) {return true;}
        public boolean isEmpty() {return true;}
        public Object peek() {return null;}
        public Object poll() {return null;}
        private void secretQDE(){}
    }
}
