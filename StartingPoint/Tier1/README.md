# Starting Point Tier 1

| Machine                     | Difficulty | OS      | Vulnerabilities | Techniques | Protocols & Tools Used  |
| :-------------------------- | :--------- | :------ | :---------------| :----------| :----- |
| [Appointment](Appointment/) | Very Easy  | Linux   | - SQLi | - Dir Busting | - Gobuster<br>- Nmap |
| [Bike](Bike/) | Very Easy | Linux | - Handlebars SSTI | - Packet Crafting | - BurpSuite<br>- Nmap<br>- Wappalyzer |
| [Crocodile](Crocodile/)     | Very Easy  | Linux   | - FTP | - Credential Theft<br>- Dir Busting | - FTP<br>- Gobuster<br>- Nmap |
| [Funnel](Funnel/) | Very Easy | Linux | - FTP<br>- Default Credentials | - Credential Theft<br>- Local Port Forwarding | -FTP<br>- Nmap<br>- PostgreSQL<br>- SSH|
| [Ignition](Ignition/)       | Very Easy  | Linux   | - Weak Credentials | - Dir Busting | - Gobuster<br>- Nmap |
| [Pennyworth](Pennyworth/) | Very Easy | Linux | - Weak Credentials | - Groovy Scripting<br>- Packet Capture<br>- Password Cracking<br>- Reverse Shell | - BurpSuite<br>- hydra<br>- Nmap|
| [Responder](Responder/)     | Very Easy  | Windows | - RFI<br>- Weak Credentials | - Credential Theft<br>- Dir Busting<br>- Hash Cracking| - curl<br>- Evil-WinRM<br>- John the Ripper<br>- Nmap<br>- Responder |
| [Sequel](Sequel/)           | Very Easy  | Linux   | - MariaDB | | - MariaDB<br>- Nmap |
| [Tactics](Tactics/) | Very Easy | Windows | - Weak Credentials<br>- SMB | - Bypassing Firewalls<br>- Password Cracking | - Impacket<br>- Metasploit<br>- Nmap|
| [Three](Three/)             | Very Easy  | Linux   | - AWS S3 Buckets | -Bash Scripting<br>- PHP Scripting<br>- Reverse Shell<br>-Service Discovery<br>- Subdomain Enumeration | - AWS CLI<br>- Gobuster<br>- Netcat<br>- Nmap<br>- Python http.server |