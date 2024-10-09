# HTB Machines

Writeups for Hack The Box Machines

<table style="border-bottom: 5px solid black;border-top: 3px solid black;border-left: 3px solid black;border-right: 3px solid black; text-align:center;">
<!-- Start Header -->
    <tr style="border-top: 2px solid black;border-left: 2px solid black;border-right: 2px solid black;">
        <th rowspan="3" style="text-align:center;width: 10%;">Machine</th>
        <th rowspan="3" style="text-align:center;width: 10%;">Collection</th>
        <th rowspan="3" style="text-align:center;width: 10%;">Difficulty</th>
        <th rowspan="3" style="text-align:center;width: 10%;">OS</th>
        <th  rowspan="2" colspan="3" style="text-align:center;width:35%;">MITRE ATT&CK</th>
        <th rowspan="3" style="text-align:center;width:15%">Tools & Technologies</th>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <th style="text-align:center;width:15%">Tactic</th>
        <th style="text-align:center;width:15%">Technique</th>
        <th style="text-align:center;width:15%">Sub-Techniques</th>
    </tr>
    <tr style="border-top: 4px solid black;border-left: 2px solid black;border-right: 2px solid black;"> 
        <!-- Appointment -->
            <td rowspan="11"><a href="StartingPoint/Tier1/Appointment/">Appointment</a></td>
            <td rowspan="11"><a href="StartingPoint/Tier1/">Starting Point Tier 1</a></td>
            <td rowspan="11">Very Easy</td>
            <td rowspan="11">Linux</td>
            <td rowspan="2">Discovery</td>
            <td rowspan="2">Network Service Discovery</td>
            <td rowspan="2"></td>
            <td rowspan="2">Nmap</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="1">Execution</td>
            <td rowspan="1">Command and Scripting Interpreter</td>
            <td rowspan="1"></td>
            <td rowspan="1"></td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="4">Initial Access</td>
            <td rowspan="2">Exploit Public Facing Application</td>
            <td rowspan="2"></td>
            <td rowspan="2">Apache HTTPD</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="2">Valid Accounts</td>
            <td rowspan="2"></td>
            <td rowspan="2"></td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
             <td rowspan="3">Reconnaissance</td>
             <td rowspan="2">Active Scanning</td>
            <td rowspan="2">Vulnerability Scanning</td>
            <td rowspan="3">Nmap</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
             <td rowspan="1">Gather Victim Host Information</td>
            <td rowspan="1">Software</td>
        </tr>
    <tr style="border-top: 4px solid black;border-left: 2px solid black;border-right: 2px solid black;"> 
        <!-- Archetype -->
            <td rowspan="21"><a href="StartingPoint/Tier2/Archetype/">Archetype</a></td>
            <td rowspan="21"><a href="StartingPoint/Tier2/">Starting Point Tier 2</a></td>
            <td rowspan="21">Very Easy</td>
            <td rowspan="21">Windows</td>
            <td rowspan="2">Credential Access</td>
            <td rowspan="2">Unsecured Credentials</td>
            <td rowspan="2">Credentials In Files</td>
            <td rowspan="2">SMB, Winpeas</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="3">Discovery</td>
            <td rowspan="2">Network Share Discovery</td>
            <td rowspan="2"></td>
            <td rowspan="3">Nmap</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="2">Network Service Discovery</td>
            <td rowspan="2"></td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="4">Initial Access</td>
            <td rowspan="2">Exploit Public-Facing Application</td>
            <td rowspan="2"></td>
            <td rowspan="2">SMB, SQL</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="2">Valid Accounts</td>
            <td rowspan="2"></td>
            <td rowspan="2">SQL</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="2">Privilege Escalation</td>
            <td rowspan="2">Exploitation for Privilege Escalation</td>
            <td rowspan="2"></td>
            <td rowspan="2">Winepeas</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="4">Reconnaissance</td>
            <td rowspan="2">Active Scanning</td>
            <td rowspan="2">Vulnerability Scanning</td>
            <td rowspan="4">Nmap</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="2">Gather Victim Host Information</td>
            <td rowspan="2">Software</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="4">Resource Development</td>
            <td rowspan="2">Develop Capabilities</td>
            <td rowspan="2">Exploits</td>
            <td rowspan="2">PowerShell</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="2">Obtain Capabilities</td>
            <td rowspan="2">Exploits</td>
            <td rowspan="2">Winpeas</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="1">Stage Capabilities</td>
            <td rowspan="1"></td>
            <td rowspan="1"></td>
            <td rowspan="1">PowerShell, Python http.server, SQL, Wget</td>
        </tr>
    <tr style="border-top: 4px solid black;border-left: 2px solid black;border-right: 2px solid black;"> 
    <!-- Bike -->
        <td rowspan="11"><a href="StartingPoint/Tier1/Bike/">Bike</a></td>
        <td rowspan="11"><a href="StartingPoint/Tier1/">Starting Point Tier 1</a></td>
        <td rowspan="11">Linux</td>
        <td rowspan="11">Very Easy</td>
        <td rowspan="2">Exfiltration</td>
        <td rowspan="2">Exfiltration Over Web Service</td>
        <td rowspan="2"></td>
        <td rowspan="2">BurpSuite, HackTricks</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="2">Collection</td>
        <td rowspan="2">Data from Local System</td>
        <td rowspan="2"></td>
        <td rowspan="2">BurpSuite, HackTricks</td>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="2">Initial Access</td>
        <td rowspan="2">Exploit Public Facing Application</td>
        <td rowspan="2"></td>
        <td rowspan="2">BurpSuite, Node.js HTTP Server</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="3">Reconnaissance</td>
        <td rowspan="2">Active Scanning</td>
        <td rowspan="2">Vulnerability Scanning</td>
        <td rowspan="2">Nmap</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="1">Gather Victim Host Information</td>
        <td rowspan="1">Software</td>
        <td rowspan="1">Nmap, Wappalyzer</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="1">Resource Development</td>
        <td rowspan="1">Exploits</td>
        <td rowspan="1"</td>
        <td rowspan="1">BurpSuite, HackTricks</td>
    </tr>
    <tr style="border-top: 4px solid black;border-left: 2px solid black;border-right: 2px solid black;"> 
        <!-- Crocodile -->
            <td rowspan="17"><a href="StartingPoint/Tier1/Crocodile/">Crocodile</a></td>
            <td rowspan="17"><a href="StartingPoint/Tier1/">Starting Point Tier 1</a></td>
            <td rowspan="17">Linux</td>
            <td rowspan="17">Very Easy</td>
            <td rowspan="4">Credential Access</td>
            <td rowspan="2">Unsecured Credentials</td>
            <td rowspan="1">Credentials In Files</td>
            <td rowspan="1">FTP</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="2">Brute Force</td>
            <td rowspan="2">Credential Stuffing</td>
            <td rowspan="2"></td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="6">Discovery</td>
            <td rowspan="2">Account Discovery</td>
            <td rowspan="2"></td>
            <td rowspan="2">FTP</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="1">File and Directory Discovery</td>
            <td rowspan="1"></td>
            <td rowspan="1">Gobuster</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="2">Network Service Discovery</td>
            <td rowspan="2"></td>
            <td rowspan="2">Nmap</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="2">Initial Access</td>
            <td rowspan="2">Exploit Public-Facing Application</td>
            <td rowspan="2"></td>
            <td rowspan="2">FTP</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="5">Reconnaissance</td>
            <td rowspan="4">Active Scanning</td>
            <td rowspan="2">Vulnerability Scanning</td>
            <td rowspan="2">Nmap</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="2">Wordlist Scanning</td>
            <td rowspan="2">Gobuster</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="1">Gather Victim Host Information</td>
            <td rowspan="1">Software</td>
            <td rowspan="1">Nmap</td>
        </tr>
    <tr style="border-top: 4px solid black;border-left: 2px solid black;border-right: 2px solid black;"> 
    <!-- Start Dancing -->
        <td rowspan="9"><a href="StartingPoint/Tier0/Dancing/">Dancing</a></td>
        <td rowspan="9"><a href="StartingPoint/Tier0/">Starting Point Tier 0</a></td>
        <td rowspan="9">Very Easy</td>
        <td rowspan="9">Windows</td>
        <td rowspan="2">Command and Control</td>
        <td rowspan="2">Application Layer Protocol</td>
        <td rowspan="2">File Transfer Protocols</td>
        <td rowspan="2">SMB</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="1">Discovery</td>
        <td rowspan="1">Network Share Discovery</td>
        <td rowspan="1"></td>
        <td rowspan="1">Nmap</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="2">Initial Access</td>
        <td rowspan="2">Exploit Public Facing Application</td>
        <td rowspan="2"></td>
        <td rowspan="2">SMB</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
         <td rowspan="3">Reconnaissance</td>
         <td rowspan="2">Active Scanning</td>
        <td rowspan="2">Vulnerability Scanning</td>
        <td rowspan="3">Nmap</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
         <td rowspan="1">Gather Victim Host Information</td>
        <td rowspan="1">Software</td>
    </tr>
    <tr style="border-top: 4px solid black;border-left: 2px solid black;border-right: 2px solid black;"> <!-- Start Explosion -->
        <td rowspan="11"><a href="StartingPoint/Tier0/Explosion/">Explosion</a></td>
        <td rowspan="11"><a href="StartingPoint/Tier0/">Starting Point Tier 0</a></td>
        <td rowspan="11">Very Easy</td>
        <td rowspan="11">Windows</td>
        <td rowspan="2">Command and Control</td>
        <td rowspan="2">Application Layer Protocol</td>
        <td rowspan="2"></td>
        <td rowspan="2">RDP</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="2">Discovery</td>
        <td rowspan="2">Network Service Discovery</td>
        <td rowspan="2"></td>
        <td rowspan="2">Nmap</td> 
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="4">Initial Access</td>
        <td rowspan="2">Valid Accounts</td>
        <td rowspan="2">Default Accounts</td>
        <td rowspan="4">RDP</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="2">External Remote Services</td>
        <td rowspan="2"></td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
         <td rowspan="3">Reconnaissance</td>
         <td rowspan="2">Active Scanning</td>
        <td rowspan="2">Vulnerability Scanning</td>
        <td rowspan="3">Nmap</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
         <td rowspan="1">Gather Victim Host Information</td>
        <td rowspan="1">Software</td>
    </tr>
    <tr style="border-top: 4px solid black;border-left: 2px solid black;border-right: 2px solid black;"><!-- Start Fawn -->
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="13"><a href="StartingPoint/Tier0/Fawn/">Fawn</a></td>
        <td rowspan="13"><a href="StartingPoint/Tier0/">Starting Point Tier 0</a></td>
        <td rowspan="13">Very Easy</td>
        <td rowspan="13">Linux</td>
        <td rowspan="1">Command and Control</td>
        <td rowspan="1">Application Layer Protocol</td>
        <td rowspan="1">File Transfer Protocols</td>
        <td rowspan="1">FTP</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="4">Discovery</td>
        <td rowspan="2">Network Share Discovery</td>
        <td rowspan="2"></td>
        <td rowspan="4">Nmap</td> 
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="2">System Information Discovery</td>
        <td rowspan="2"></td> <!-- Fawn T1T2S --> 
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="4">Initial Access</td> <!-- Fawn T2 -->
        <td rowspan="2">Exploit Public Facing Application</td> <!-- Fawn T2T1 -->
        <td rowspan="2"></td> <!-- Fawn T2T1S -->
        <td rowspan="4">FTP</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="2">Valid Accounts</td> <!-- Fawn T2T2 -->
        <td rowspan="2">Default Accounts</td> <!-- Fawn T2T2S1 -->
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
         <td rowspan="3">Reconnaissance</td>
         <td rowspan="2">Active Scanning</td>
        <td rowspan="2">Vulnerability Scanning</td>
        <td rowspan="3">Nmap</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
         <td rowspan="1">Gather Victim Host Information</td>
        <td rowspan="1">Software</td>
    </tr>
    <tr style="border-top: 4px solid black;border-left: 2px solid black;border-right: 2px solid black;"> 
        <!-- Funnel -->
            <td rowspan="21"><a href="StartingPoint/Tier1/Funnel/">Funnel</a></td>
            <td rowspan="21"><a href="StartingPoint/Tier1/">Starting Point Tier 1</a></td>
            <td rowspan="21">Linux</td>
            <td rowspan="21">Very Easy</td>
            <td rowspan="2">Collection</td>
            <td rowspan="2">Data from Local System</td>
            <td rowspan="2"></td>
            <td rowspan="2">PostgreSQL</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="4">Command and Control</td>
            <td rowspan="2">Application Layer Protocol</td>
            <td rowspan="2"></td>
            <td rowspan="4">SSH</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="2">Protocol Tunneling</td>
            <td rowspan="2"></td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="4">Discovery</td>
            <td rowspan="2">Account Discovery</td>
            <td rowspan="2">Email Account</td>
            <td rowspan="2">FTP</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="2">Network Service Discovery</td>
            <td rowspan="2"></td>
            <td rowspan="2">Nmap</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="6">Initial Access</td>
            <td rowspan="2">Exploit Public-Facing Application</td>
            <td rowspan="2"></td>
            <td rowspan="2">FTP, PostgreSQL</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="2">External Remote Services</td>
            <td rowspan="2"></td>
            <td rowspan="2">SSH</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="2">Valid Accounts</td>
            <td rowspan="2">Default Accounts</td>
            <td rowspan="2">FTP, PostgreSQL</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="2">Lateral Movement</td>
            <td rowspan="2">Remote Services</td>
            <td rowspan="2">SSH</td>
            <td rowspan="2">SSH</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="3">Reconnaissance</td>
            <td rowspan="2">Active Scanning</td>
            <td rowspan="2">Vulnerability Scanning</td>
            <td rowspan="3">Nmap</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="1">Gather Victim Host Information</td>
            <td rowspan="1">Software</td>
        </tr>
    <tr style="border-top: 4px solid black;border-left: 2px solid black;border-right: 2px solid black;"> 
        <!-- Ignition -->
            <td rowspan="15"><a href="StartingPoint/Tier1/Ignition/">Ignition</a></td>
            <td rowspan="15"><a href="StartingPoint/Tier1/">Starting Point Tier 1</a></td>
            <td rowspan="15">Linux</td>
            <td rowspan="15">Very Easy</td>
            <td rowspan="2">Credential Access</td>
            <td rowspan="2">Brute Force</td>
            <td rowspan="2">Credential Stuffing</td>
            <td rowspan="2"></td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="4">Discovery</td>
            <td rowspan="2">File and Directory Discovery</td>
            <td rowspan="2"></td>
            <td rowspan="2">Gobuster</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="2">Network Service Discovery</td>
            <td rowspan="2"></td>
            <td rowspan="2">Nmap</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="4">Initial Access</td>
            <td rowspan="2">Exploit Public-Facing Application</td>
            <td rowspan="2"></td>
            <td rowspan="2">nginx HTTP Server</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="2">Valid Accounts</td>
            <td rowspan="2"></td>
            <td rowspan="2"></td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="5">Reconnaissance</td>
            <td rowspan="4">Active Scanning</td>
            <td rowspan="2">Vulnerability Scanning</td>
            <td rowspan="2">Nmap</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="1">Wordlist Scanning</td>
            <td rowspan="1">Gobuster</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="1">Gather Host Information</td>
            <td rowspan="1">Software</td>
            <td rowspan="1">Nmap</td>
        </tr>
    <tr style="border-top: 4px solid black;border-left: 2px solid black;border-right: 2px solid black;"> <!-- Start Meow -->
        <td rowspan="13"><a href="StartingPoint/Tier0/Meow/">Meow</a></td>
        <td rowspan="13"><a href="StartingPoint/Tier0/">Starting Point Tier 0</a></td>
        <td rowspan="13">Very Easy</td>
        <td rowspan="13">Linux</td>
        <td rowspan="2">Command and Control</td>
        <td rowspan="2">Application Layer Protocol</td>
        <td rowspan="2">Sub</td>
        <td rowspan="2">Telnet</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="2">Credential Access</td> <!-- Meow T1 -->
        <td rowspan="2">Brute Force</td>
        <td rowspan="2">Password Guessing</td> 
        <td rowspan="2"></td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"> <!-- Meow T2 -->
        <td rowspan="2">Discovery</td> 
        <td rowspan="2">Network Service Discovery</td>
        <td rowspan="2"></td>
        <td rowspan="2">Nmap</td> 
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"> <!-- Meow T3 -->
        <td rowspan="4">Initial Access</td> 
        <td rowspan="2">Exploit Public-Facing Application</td>
        <td rowspan="2"></td>
        <td rowspan="4">Telnet</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="2">Valid Accounts</td>
        <td rowspan="2">Default Accounts</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
         <td rowspan="3">Reconnaissance</td>
         <td rowspan="2">Active Scanning</td>
        <td rowspan="2">Vulnerability Scanning</td>
        <td rowspan="3">Nmap</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
         <td rowspan="1">Gather Victim Host Information</td>
        <td rowspan="1">Software</td>
    </tr>
    <tr style="border-top: 4px solid black;border-left: 2px solid black;border-right: 2px solid black;"> <!-- Start Mongod -->
        <td rowspan="7"><a href="StartingPoint/Tier0/Mongod/">Mongod</a></td>
        <td rowspan="7"><a href="StartingPoint/Tier0/">Starting Point Tier 0</a></td>
        <td rowspan="7">Very Easy</td>
        <td rowspan="7">Linux</td>
        <td rowspan="2">Collection</td>
        <td rowspan="2">Data from Information Repositories</td>
        <td rowspan="2">Data from Local System</td>
        <td rowspan="2">MongoDB</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="2">Discovery</td>
        <td rowspan="2">Network Service Discovery</td>
        <td rowspan="2"></td>
        <td rowspan="2">Nmap</td> 
    </tr>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
         <td rowspan="3">Reconnaissance</td>
         <td rowspan="2">Active Scanning</td>
        <td rowspan="2">Vulnerability Scanning</td>
        <td rowspan="3">Nmap</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
         <td rowspan="1">Gather Victim Host Information</td>
        <td rowspan="1">Software</td>
    </tr>
    <tr style="border-top: 4px solid black;border-left: 2px solid black;border-right: 2px solid black;"> 
        <!-- Pennyworth -->
            <td rowspan="21"><a href="StartingPoint/Tier1/Pennyworth/">Pennyworth</a></td>
            <td rowspan="21"><a href="StartingPoint/Tier1/">Starting Point Tier 1</a></td>
            <td rowspan="21">Linux</td>
            <td rowspan="21">Very Easy</td>
            <td rowspan="4">Credential Access</td>
            <td rowspan="2">Adversary-in-the-Middle</td>
            <td rowspan="2"></td>
            <td rowspan="2">BurpSuite</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="2">Brute Force</td>
            <td rowspan="2"></td>
            <td rowspan="2">Hydra</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="4">Command and Control</td>
            <td rowspan="2">Content Injection</td>
            <td rowspan="2"></td>
            <td rowspan="2">Jenkins Script Console</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="2">Non-Application Layer Protocol</td>
            <td rowspan="2"></td>
            <td rowspan="2">Java, Netcat</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="2">Discovery</td>
            <td rowspan="2">Network Service Discovery</td>
            <td rowspan="2"></td>
            <td rowspan="2">Nmap</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="2">Execution</td>
            <td rowspan="2">Software Deployment Tools</td>
            <td rowspan="2"></td>
            <td rowspan="2">Jenkins Script Console</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="4">Initial Access</td>
            <td rowspan="2">Exploit Public-Facing Application</td>
            <td rowspan="2"></td>
            <td rowspan="4">Jenkins</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="2">Valid Accounts</td>
            <td rowspan="2"></td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="3">Reconnaissance</td>
            <td rowspan="1">Active Scanning</td>
            <td rowspan="1">Vulnerability Scanning</td>
            <td rowspan="3">Nmap</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="1">Gather Host Information</td>
            <td rowspan="1">Software</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="1">Resource Development</td>
            <td rowspan="1">Develop Capabilities</td>
            <td rowspan="1">Exploits</td>
            <td rowspan="1">Java</td>
        </tr>
    <tr style="border-top: 4px solid black;border-left: 2px solid black;border-right: 2px solid black;"> <!-- Start Preignition -->
        <td rowspan="11"><a href="StartingPoint/Tier0/Preignition/">Preignition</a></td>
        <td rowspan="11"><a href="StartingPoint/Tier0/">Starting Point Tier 0</a></td>
        <td rowspan="11">Very Easy</td>
        <td rowspan="11">Linux</td>
        <td rowspan="2">Command and Control</td>
        <td rowspan="2">Application Layer Protocol</td>
        <td rowspan="2">Web Protocols</td>
        <td rowspan="2">Curl</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="4">Discovery</td>
        <td rowspan="2">File and Directory Discovery</td>
        <td rowspan="2"></td>
        <td rowspan="2">Gobuster</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="2">Network Service Discovery</td>
        <td rowspan="2"></td>
        <td rowspan="2">Nmap</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
         <td rowspan="5">Reconnaissance</td>
         <td rowspan="4">Active Scanning</td>
        <td rowspan="2">Vulnerability Scanning</td>
        <td rowspan="2">Nmap</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <td rowspan="2">Wordlist Scanning</td>
        <td rowspan="2">Gobuster</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
         <td rowspan="1">Gather Victim Host Information</td>
        <td rowspan="1">Software</td>
        <td rowspan="1">Nmap</td>
    </tr>
    <tr style="border-top: 4px solid black;border-left: 2px solid black;border-right: 2px solid black;"> <!-- Start Redeemer -->
        <td rowspan="7"><a href="StartingPoint/Tier0/Redeemer/">Redeemer</a></td>
        <td rowspan="7"><a href="StartingPoint/Tier0/">Starting Point Tier 0</a></td>
        <td rowspan="7">Very Easy</td>
        <td rowspan="7">Linux</td>
        <td rowspan="2">Collection</td>
        <td rowspan="2">Data from Information Repositories</td>
        <td rowspan="2">Data from Local System</td>
        <td rowspan="2">Redis</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="2">Discovery</td>
        <td rowspan="2">Network Service Discovery</td>
        <td rowspan="2"></td>
        <td rowspan="2">Nmap</td> 
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
         <td rowspan="3">Reconnaissance</td>
         <td rowspan="2">Active Scanning</td>
        <td rowspan="2">Vulnerability Scanning</td>
        <td rowspan="3">Nmap</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
         <td rowspan="1">Gather Victim Host Information</td>
        <td rowspan="1">Software</td>
    </tr>
    <tr style="border-top: 4px solid black;border-left: 2px solid black;border-right: 2px solid black;"> 
        <!-- Responder -->
            <td rowspan="9"><a href="StartingPoint/Tier1/Responder/">Responder</a></td>
            <td rowspan="9"><a href="StartingPoint/Tier1/">Starting Point Tier 1</a></td>
            <td rowspan="9">Windows</td>
            <td rowspan="9">Very Easy</td>
            <td rowspan="4">Credential Access</td>
            <td rowspan="2">Brute Force</td>
            <td rowspan="2">Credential Stuffing</td>
            <td rowspan="2">John the Ripper</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="2">Forced Authentication</td>
            <td rowspan="2">Responder</td>
            <td rowspan="2">Evil-WinRM</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="2">Execution</td>
            <td rowspan="2">Command and Scripting Interpreter</td>
            <td rowspan="2">PowerShell</td>
            <td rowspan="2">Evil-WinRM</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="2">Initial Access</td>
            <td rowspan="2">Valid Accounts</td>
            <td rowspan="2">Local Accounts</td>
            <td rowspan="2">Evil-WinRM</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="1">Reconnaissance</td>
            <td rowspan="1">Gather Victim Host Information</td>
            <td rowspan="1">Software</td>
            <td rowspan="1">Curl</td>
        </tr>
    <tr style="border-top: 4px solid black;border-left: 2px solid black;border-right: 2px solid black;"> 
        <!-- Sequel -->
            <td rowspan="11"><a href="StartingPoint/Tier1/Sequel/">Sequel</a></td>
            <td rowspan="11"><a href="StartingPoint/Tier1/">Starting Point Tier 1</a></td>
            <td rowspan="11">Linux</td>
            <td rowspan="11">Very Easy</td>
            <td rowspan="2">Collection</td>
            <td rowspan="2">Data from Information Repositories</td>
            <td rowspan="2"></td>
            <td rowspan="2">MariaDB</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="2">Discovery</td>
            <td rowspan="2">Network Service Discovery</td>
            <td rowspan="2"></td>
            <td rowspan="2">Namp</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="4">Initial Access</td>
            <td rowspan="2">Exploit Public-Facing Application</td>
            <td rowspan="2"></td>
            <td rowspan="4">MariaDB Server</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="2">Valid Accounts</td>
            <td rowspan="2">Default Accounts</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="3">Reconnaissance</td>
            <td rowspan="2">Active Scanning</td>
            <td rowspan="2">Vulnerability Scanning</td>
            <td rowspan="3">Nmap</td>
        </tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
        <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="1">Gather Victim Host Information</td>
            <td rowspan="1">Software</td>
        </tr>
    <tr style="border-top: 4px solid black;border-left: 2px solid black;border-right: 2px solid black;"> <!-- Start Synced -->
        <td rowspan="11"><a href="StartingPoint/Tier0/Synced/">Synced</a></td>
        <td rowspan="11"><a href="StartingPoint/Tier0/">Starting Point Tier 0</a></td>
        <td rowspan="11">Very Easy</td>
        <td rowspan="11">Linux</td>
        <td rowspan="2">Data from Information Repositories</td>
        <td rowspan="2"></td>
        <td rowspan="2"></td>
        <td rowspan="2">rsync</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
     <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="2">Discovery</td>
        <td rowspan="2">Network Share Discovery</td>
        <td rowspan="2"></td>
        <td rowspan="2">Nmap</td> 
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="4">Initial Access</td>
        <td rowspan="2">External Remote Services</td> 
        <td rowspan="2"></td>
        <td rowspan="4">rsync</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="2">Valid Accounts</td>
        <td rowspan="2">Default Accounts</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="3">Reconnaissance</td>
        <td rowspan="2">Active Scanning</td>
        <td rowspan="2">Vulnerability Scanning</td>
        <td rowspan="3">Nmap</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="1">Gather Victim Host Information</td>
        <td rowspan="1">Software</td>
    </tr>
    <tr style="border-top: 4px solid black;border-left: 2px solid black;border-right: 2px solid black;"> 
    <!-- Tactics -->
        <td rowspan="15"><a href="StartingPoint/Tier1/Tactics/">Tactics</a></td>
        <td rowspan="15"><a href="StartingPoint/Tier1/">Starting Point Tier 1</a></td>
        <td rowspan="15">Windows</td>
        <td rowspan="15">Very Easy</td>
        <td rowspan="2">Credential Access</td>
        <td rowspan="2">Brute Force</td>
        <td rowspan="2">Credential Stuffing</td>
        <td rowspan="2">Metasploit</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="2">Collection</td>
        <td rowspan="2">Data from Local System</td>
        <td rowspan="2"></td>
        <td rowspan="2">Impacket psexec</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="2">Discovery</td>
        <td rowspan="2">Network Share Discovery</td>
        <td rowspan="2"></td>
        <td rowspan="2">Nmap</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="2">Execution</td>
        <td rowspan="2">Command and Scripting Interpreter</td>
        <td rowspan="2">PowerShell</td>
        <td rowspan="2">Impacket psexec</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="4">Initial Access</td>
        <td rowspan="2">Exploit Public-Facing Application</td>
        <td rowspan="2"></td>
        <td rowspan="4">Impacket psexec, SMB</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="2">Valid Accounts</td>
        <td rowspan="2">Default Accounts</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
            <td rowspan="3">Reconnaissance</td>
        <td rowspan="2">Active Scanning</td>
        <td rowspan="2">Vulnerability Scanning</td>
        <td rowspan="3">Nmap</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="1">Gather Victim Host Information</td>
        <td rowspan="1">Software</td>
    </tr>
    <tr style="border-top: 4px solid black;border-left: 2px solid black;border-right: 2px solid black;"> 
    <!-- Three -->
        <td rowspan="27"><a href="StartingPoint/Tier1/Three/">Three</a></td>
        <td rowspan="27"><a href="StartingPoint/Tier1/">Starting Point Tier 1</a></td>
        <td rowspan="27">Linux</td>
        <td rowspan="27">Very Easy</td>
        <td rowspan="4">Command and Control</td>
        <td rowspan="2">Content Injection</td>
        <td rowspan="2"></td>
        <td rowspan="2">AWS CLI</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="2">Non-Application Layer Protocol</td>
        <td rowspan="2"></td>
        <td rowspan="2">TCP Over Bash, Netcat, PHP</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="2">Discovery</td>
        <td rowspan="2">Network Service Discovery</td>
        <td rowspan="2"></td>
        <td rowspan="2">Gobuster, Nmap</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="4">Execution</td>
        <td rowspan="4">Command and Scripting Interpreter</td>
        <td rowspan="2">Unix Shell</td>
        <td rowspan="2">PHP</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="2">Network Device CLI</td>
        <td rowspan="2">Bash</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="2">Initial Access</td>
        <td rowspan="2">Content Injection</td>
        <td rowspan="2"></td>
        <td rowspan="2">AWS CLI</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="2">Exploit Public-Facing Application</td>
        <td rowspan="2"></td>
        <td rowspan="2"></td>
        <td rowspan="2">AWS S3 HTTP Server</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="10">Reconnaissance</td>
        <td rowspan="4">Active Scanning</td>
        <td rowspan="2">Vulnerability Scanning</td>
        <td rowspan="2">Nmap</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="2">Wordlist Scanning</td>
        <td rowspan="2">Gobuster</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="2">Gather Victim Host Information</td>
        <td rowspan="2">Software</td>
        <td rowspan="2">Nmap</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="2">Gather Victim Identity Information</td>
        <td rowspan="2">Email Addresses</td>
        <td rowspan="2"></td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="2">Search Victim-Owned Websites</td>
        <td rowspan="2"></td>
        <td rowspan="2"></td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="3">Resource Development</td>
        <td rowspan="2">Develop Capabilities</td>
        <td rowspan="2">Exploits</td>
        <td rowspan="2">Bash, PHP</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;"></tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;">
        <td rowspan="1">Stage Capabilities</td>
        <td rowspan="1">Upload Malware</td>
        <td rowspan="1">Bash, Curl, Python http.server</td>
    </tr>
</table>
