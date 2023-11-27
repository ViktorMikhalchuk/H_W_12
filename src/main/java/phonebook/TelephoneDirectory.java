package phonebook;

import java.util.ArrayList;
import java.util.List;

public class TelephoneDirectory {
        private List<Record> entries;

        public TelephoneDirectory() {
            this.entries = new ArrayList<>();
        }

        public void add(Record entry) {
            entries.add(entry);
        }

        public Record find(String name) {
            for (Record entry : entries) {
                if (entry.getName().equals(name)) {
                    return entry;
                }
            }
            return null;
        }
    }

