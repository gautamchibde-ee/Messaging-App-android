# Android Developer Interview PR Template

Thank you for your submission! This PR is part of the Android Developer interview. Please use this template to guide your responses during the review process. Be as detailed as necessary to help reviewers understand your decisions and reasoning.

---

## 🚀 Feature Summary

**Brief Description:**
- What feature did you implement?
- What functionality does it provide?

---

## 🧠 Design & Architecture

1. **What do you consider the most significant contributions in this PR?**

2. **Walk us through your design and architecture choices.**
    - Architecture used (e.g., MVVM, MVI)
    - Data flow overview
    - Key patterns and separation of concerns

3. **Were there any alternative solutions you considered? Why did you choose this one?**

4. **What were the main challenges, and how did you overcome them?**

5. **How did you ensure code maintainability, scalability, and readability?**

---

## 🏗 Architecture & State Management

1. **Why did you choose this architectural pattern (e.g., MVVM)?**

2. **Describe the data flow between the UI, ViewModel, and data layer.**

3. **Did you add any new layers (e.g., Use Cases, Repositories)? Why?**

4. **How did you handle state management in ViewModel and Compose UI?**

---

## 🎨 Jetpack Compose UI

1. **Why did you structure your composables in this way? What are the benefits?**

2. **You used [e.g., `remember`, `LaunchedEffect`, `derivedStateOf`]. What was the reason and impact?**

3. **How did you ensure UI responsiveness across screen sizes and orientations?**

4. **Did you consider UI performance or recomposition optimizations?**

5. **How are user interactions handled and passed to the ViewModel?**

---

## ✅ Unit Testing (ViewModel & Dependencies)

1. **How did you test ViewModel logic in isolation?**

2. **Why did you choose specific test cases? What critical paths do they cover?**

3. **How did you use mocking frameworks like MockK or Mockito effectively?**

4. **How did you handle coroutines/flows in tests to ensure reliable results?**

5. **Are there any untested edge cases you’re aware of? How would you cover them?**

---

## 🧪 UI Testing (Compose)

1. **What is the goal of your UI tests? How do they complement unit tests?**

2. **What user flow are you verifying in each UI test?**

3. **How did you ensure your UI tests are stable and not flaky?**

4. **Explain the use of Compose test APIs like `onNodeWithText`, `performClick`, etc.**

5. **How would you expand your UI tests to handle edge cases or device variations?**

---

## 🔍 Additional Considerations

- **Code Style / Linting:** Any deviations or adherence to conventions?
- **Performance:** Any optimizations done?
- **Error Handling:** How are errors handled in the UI and ViewModel?
- **Accessibility:** What steps did you take to ensure accessibility?
- **Security:** Any data/privacy/security considerations?
- **Logging / Analytics:** How would you instrument this feature in production?

---

## 📸 Screenshots (Optional)

Include screenshots or screen recordings if helpful for visual context.

---

## ✅ Checklist

- [ ] Code compiles and builds without errors
- [ ] All tests pass locally
- [ ] Code is documented and follows style guidelines
- [ ] New components are modular and testable
- [ ] Unit tests added for ViewModel & logic
- [ ] UI tests added for Compose screen

---

Thank you again! 🙌