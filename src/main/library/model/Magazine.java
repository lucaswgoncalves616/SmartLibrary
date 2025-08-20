package library.model;

public class Magazine extends Item{
        private int edition;

        public Magazine(String id, String title, int year, boolean loaned, int edition) {
            super(id, title, year, loaned);
            this.edition = edition;
        }

        public int getEdition() {
            return this.edition;
        }
}
