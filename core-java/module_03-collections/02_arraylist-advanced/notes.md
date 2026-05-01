# Module 3 - Collections (ArrayList Advanced)

## Traversing ArrayList

### 1. Using for loop

```java
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}
```

---

### 2. Enhanced for loop (for-each)

```java
for (int num : list) {
    System.out.println(num);
}
```java

---

## Sorting ArrayList

```java
import java.util.Collections;

Collections.sort(list);
```

---

## Searching Elements

```java
list.contains(value) → returns true/false

list.indexOf(value) → returns index
```

---

## Important Concepts

- Use `get(index)` to access elements
- `size()` gives total elements
- `Collections.sort()` sorts in ascending order

---

## Key Takeaways

- Traversal is essential for processing data
- Sorting helps organize data
- Searching helps find elements quickly