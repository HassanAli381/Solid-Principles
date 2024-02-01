# Interface Segregation Principle (ISP)

The Interface Segregation Principle is one of the SOLID principles in object-oriented programming. It states that a class should not be forced to implement interfaces it does not use.

## Advantages:

1. **Reduced Coupling:**
   - Minimizes dependencies by ensuring that clients are not forced to depend on interfaces they don't use.

2. **More Cohesive Interfaces:**
   - Promotes the creation of small, specific interfaces, making them more focused and easier to understand.

3. **Easier Maintenance:**
   - Changes to one part of the system (an interface) don't impact unrelated parts, making maintenance simpler.

4. **Flexibility:**
   - Allows for more flexible and adaptable designs, as classes only need to implement the interfaces relevant to their behavior.

## Usage:

To adhere to the Interface Segregation Principle, design interfaces to be cohesive and create smaller, specialized interfaces rather than large, general-purpose ones.
