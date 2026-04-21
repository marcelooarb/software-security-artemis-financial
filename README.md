I selected my Practices for Secure Software Report for Artemis Financial. Artemis Financial is a consulting company that provides financial planning services, including investments, retirement, and insurance. The main issue the company wanted to address was improving the security of its web application, specifically by adding secure communication and a way to verify that data had not been altered during transmission.



One thing I did well in this project was identifying ways to strengthen both data integrity and secure communication. I implemented a SHA-256 checksum and configured the application to use HTTPS. This was important because secure coding helps protect sensitive data, especially in financial applications where confidentiality and trust are critical. Strong security practices add value to a company by reducing risk, protecting customer information, and helping maintain a good reputation.



One of the more challenging parts of the project was working with certificates and configuring HTTPS. Understanding how keystores, certificates, and ports work together took some trial and error. However, it was also one of the most helpful parts because it gave me practical experience with real-world security configuration.



I increased the layers of security by adding hashing for data integrity and enabling HTTPS for encrypted communication. In the future, I would continue using tools like OWASP Dependency-Check and secure coding guidelines to assess vulnerabilities and decide how to mitigate them. These tools help identify risks not only in my code but also in third-party dependencies.



To make sure the application was functional and secure, I tested the code by running the application, verifying the /hash endpoint, and confirming that HTTPS worked correctly. After refactoring the code, I ran dependency-check to ensure that I did not introduce any new vulnerabilities. I also performed manual code review to check for logic errors and configuration issues.



Some of the resources and tools I used in this project include Java’s MessageDigest class for hashing, Spring Boot configuration for HTTPS, and the OWASP Dependency-Check tool for vulnerability scanning. These are tools I would definitely continue using in future projects.



If I were to show this work to a future employer, I would highlight my ability to implement secure communication, apply hashing for data integrity, and use security tools to analyze vulnerabilities. This project demonstrates that I understand both the coding side and the security side of building a software application.