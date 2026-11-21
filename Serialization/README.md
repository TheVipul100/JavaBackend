\# Java Serialization \& Deserialization Demo



Examples of Java object serialization, split into two folders the way a real sender and receiver would work: one writes `.ser` files, the other reads them.



\## Structure



```

serialization/   (src\_day41)

├── whatsapp.message/          Message, MessageSerialization, Driver

├── practice/                  Animal (+ Dog), Driver

└── eCommerceSerialized/       Address, Order, OrderItem, OrderSerialize, Driver



deserialization/

├── whatsapp.message/          Message

├── whatsapp.read.message/     Driver

├── practice/                  Animal (+ Dog), Driver

├── eCommerceSerialized/       Address, Order, OrderItem

└── eCommerceReadDeserialize/  Driver

```



The model classes (`Message`, `Dog`, `Address`, `Order`, `OrderItem`) exist in both folders. A `.ser` file holds only data, so the reading side must have the same classes: same package, same class name, same `serialVersionUID`.



\## How to run



1\. Open each folder as its own project and mark `src` as the sources root.

2\. \*\*Edit the file paths\*\* in the drivers (`E:\\Java Backend\\...`) to a folder on your machine. The serializer and the matching deserializer driver must point to the same `.ser` file.

3\. Run the serializer drivers first, then the deserializer drivers.



Requires Java 25 as written, because the drivers use `static void main` without `public`. Add `public` to run on older versions.



\## Expected output



| Demo | Output |

|---|---|

| whatsapp | `De serialize: <message> and user id: null` |

| practice | `Animal no-arg constructor`, then `zerox`, then `unknown` |

| eCommerce | `123 false null`, `sku price is :360000`, `banglore 34th cross road 56788` |



\## Concepts covered



\### 1. `transient` and `serialVersionUID` (whatsapp)

\- `userId` is `transient`: skipped when writing and comes back `null`. Use it for sensitive or derived data.

\- `serialVersionUID` is checked on deserialization. If you don't declare it, the JVM generates one from the class structure and almost any change breaks old `.ser` files (`InvalidClassException`). Declare it explicitly, and change it only for an incompatible change.



\### 2. Non-serializable parent class (practice)

\- `Dog` is `Serializable`, its parent `Animal` is not. Only `Dog`'s fields (`name`) are written.

\- On deserialization, the first non-serializable ancestor's \*\*no-arg constructor runs\*\*, so `species` comes back as `"unknown"`, not `"Labrador"`.

\- `Dog`'s own constructor is \*\*skipped\*\*: its fields are restored from the stream.

\- If `Animal` has no accessible no-arg constructor, deserialization fails with `InvalidClassException`.



\### 3. Multiple objects in one stream (eCommerce)

\- Objects must be read in the order they were written (`OrderItem`, `Order`, `Address`), otherwise you get `ClassCastException`.

\- `cardNumber` and `total` are `transient`, so they come back `null`.



\## Interview notes

\- \*\*Static fields are not serialized.\*\* They belong to the class, not the object.

\- \*\*A `.ser` file has no bytecode.\*\* It holds the class name, `serialVersionUID`, field names/types and values. The reading JVM must already have the class (`ClassNotFoundException` otherwise).

\- \*\*`NotSerializableException`\*\* is thrown when the object's class, or any object referenced by one of its fields, does not implement `Serializable`.

\- \*\*Deserialization does not call the constructor\*\* of a `Serializable` class.

\- \*\*Serializing does not remove the object\*\* from the heap. It writes a copy of its state.

\- \*\*Never log or serialize card numbers or passwords\*\* in real code. `Order.toString()` prints the card number only to show it is `null` after deserialization.

