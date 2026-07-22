class ProductOfNumbers {

   List<Integer> b;

    public ProductOfNumbers() {
        b = new ArrayList<>();
        b.add(1);
    }

    public void add(int num) {
        if (num == 0) {
            b.clear();
            b.add(1);
        } else {
            b.add(b.get(b.size() - 1) * num);
        }
    }

    public int getProduct(int k) {
        if (k >= b.size()) {
            return 0;
        }

        int n = b.size();
        return b.get(n - 1) / b.get(n - 1 - k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */