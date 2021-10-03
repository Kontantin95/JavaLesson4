public class HomeWork5 {
    public static void main(String[] args) {
        part1();
        part2();
    }

    private static void part1() {
        Map <String, Integer> hm = new HashMap<>();
        String[] words = {
                "Tie", "Beta", "Alpha",
                "Cheese", "Gamma", "Humster",
                "Dog", "Cat", "Java",
                "Vava", "Kent", "Tie",
                "Dog", "Gamma", "Humster",
                "Cat", "Java", "Vava", "Dog"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }

        System.out.println(hm);
    }

    private static void part2() {
        Directory directory = new Directory();

        directory.add("sidorov", "8999123321");
        directory.add("sidorov", "8912155326");
        directory.add("petrov", "8917155552");
        directory.add("petrov", "8913455672");
        directory.add("iwanov", "899999999");
        directory.add("iwanov", "899111111");
        directory.add("petrov", "89923231999");
        directory.add("dolgov", "8888123113");
        directory.add("iwanov", "8324325234");

        System.out.println(directory.get("sidorov"));
        System.out.println(directory.get("iwanov"));
        System.out.println(directory.get("petrov"));
        System.out.println(directory.get("dolgov"));
    }
}

class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }

}

}
