package section_nine_interfaces;

public class Tree {

    int numberOfBranches;
    String type;

    public Tree(int numberOfBranches, String type) {
        this.numberOfBranches = numberOfBranches;
        this.type = type;

    }

    public int getNumberOfBranches() {
        return numberOfBranches;
    }

    public void setNumberOfBranches(int numberOfBranches) {
        this.numberOfBranches = numberOfBranches;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public class Branch {
        private int numberOfLeaves;
        private int height;

        public Branch(int numberOfLeaves, int height) {
            this.numberOfLeaves = numberOfLeaves;
            this.height = height;
        }

        public int getNumberOfLeaves() {
            return numberOfLeaves;
        }

        public void setNumberOfLeaves(int numberOfLeaves) {
            this.numberOfLeaves = numberOfLeaves;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }
    }

}
