# Starting Point Tier 0
<table style="border-bottom: 5px solid black;border-top: 3px solid black;border-left: 3px solid black;border-right: 3px solid black; text-align:center; width: 100%;border-collapse: collapse;">
<!-- Start Header -->
    <tr style="border-top: 2px solid black;border-left: 2px solid black;border-right: 2px solid black;background: none;background: none;">
        <th rowspan="2" style="text-align:center;width: 10%;">Machine</th>
        <th rowspan="2" style="text-align:center;width: 10%;">Collection</th>
        <th rowspan="2" style="text-align:center;width: 10%;">Difficulty</th>
        <th rowspan="2" style="text-align:center;width: 10%;">OS</th>
        <th colspan="3" style="text-align:center;width:35%;">MITRE ATT&CK</th>
        <th rowspan="2" style="text-align:center;width:15%">Tools</th>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;background: none;background: none;">
        <th style="text-align:center;width:15%">Tactic</th>
        <th style="text-align:center;width:15%">Technique</th>
        <th style="text-align:center;width:15%">Sub-Techniques</th>
    </tr> 
    <tr style="border-top: 4px solid black;border-left: 2px solid black;border-right: 2px solid black;background: none;"> <!-- Start Dancing -->
        <td rowspan="3"><a href="Dancing/">Dancing</a></td>
        <td rowspan="3"><a href="/">Starting Point Tier 0</a></td>
        <td rowspan="3">Very Easy</td>
        <td rowspan="3">Windows</td>
        <td rowspan="1">Command and Control</td>
        <td rowspan="1">Application Layer Protocol</td>
        <td rowspan="1">File Transfer Protocols</td>
        <td rowspan="1">SMB</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;background: none;">
        <td rowspan="1">Discovery</td>
        <td rowspan="1">Network Share Discovery</td>
        <td rowspan="1"></td>
        <td rowspan="1">Nmap</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;background: none;">
        <td rowspan="1">Initial Access</td>
        <td rowspan="1">Exploit Public Facing Application</td>
        <td rowspan="1"></td>
        <td rowspan="1">SMB</td>
    </tr>
    <tr style="border-top: 4px solid black;border-left: 2px solid black;border-right: 2px solid black;background: none;"> <!-- Start Explosion -->
        <td rowspan="4"><a href="Explosion/">Explosion</a></td>
        <td rowspan="4"><a href="/">Starting Point Tier 0</a></td>
        <td rowspan="4">Very Easy</td>
        <td rowspan="4">Windows</td>
        <td rowspan="1">Command and Control</td>
        <td rowspan="1">Application Layer Protocol</td>
        <td rowspan="1"></td>
        <td rowspan="1">RDP</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;background: none;">
        <td rowspan="1">Discovery</td>
        <td rowspan="1">Network Service Discovery</td>
        <td rowspan="1"></td>
        <td rowspan="1">Nmap</td> 
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;background: none;">
        <td rowspan="2">Initial Access</td>
        <td rowspan="1">Valid Accounts</td>
        <td rowspan="1">Default Accounts</td>
        <td rowspan="2">RDP</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;background: none;">
        <td rowspan="1">External Remote Services</td>
        <td></td>
    </tr>
    <tr style="border-top: 4px solid black;border-left: 2px solid black;border-right: 2px solid black;background: none;"> <!-- Start Fawn -->
        <td rowspan="5"><a href="Fawn/">Fawn</a></td>
        <td rowspan="5"><a href="/">Starting Point Tier 0</a></td>
        <td rowspan="5">Very Easy</td>
        <td rowspan="5">Linux</td>
        <td rowspan="1">Command and Control</td>
        <td rowspan="1">Application Layer Protocol</td>
        <td rowspan="1">File Transfer Protocols</td>
        <td rowspan="1">FTP</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;background: none;">
        <td rowspan="2">Discovery</td>
        <td rowspan="1">Network Share Discovery</td>
        <td rowspan="1"></td>
        <td rowspan="2">Nmap</td> 
    <tr style="border-left: 2px solid black;border-right: 2px solid black;background: none;">
        <td rowspan="1">System Information Discovery</td>
        <td rowspan="1"></td> <!-- Fawn T1T2S --> 
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;background: none;">
        <td rowspan="2">Initial Access</td> <!-- Fawn T2 -->
        <td rowspan="1">Exploit Public Facing Application</td> <!-- Fawn T2T1 -->
        <td rowspan="1"></td> <!-- Fawn T2T1S -->
        <td rowspan="2">FTP</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;background: none;">
        <td rowspan="1">Valid Accounts</td> <!-- Fawn T2T2 -->
        <td rowspan="1">Default Accounts</td> <!-- Fawn T2T2S1 -->
    </tr> <!-- End Fawn -->
    <tr style="border-top: 4px solid black;border-left: 2px solid black;border-right: 2px solid black;background: none;"> <!-- Start Meow -->
        <td rowspan="5"><a href="Meow/">Meow</a></td>
        <td rowspan="5"><a href="/">Starting Point Tier 0</a></td>
        <td rowspan="5">Very Easy</td>
        <td rowspan="5">Linux</td>
        <td rowspan="1">Command and Control</td>
        <td rowspan="1">Application Layer Protocol</td>
        <td rowspan="1"></td>
        <td rowspan="1">Telnet</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;background: none;">
        <td rowspan="1">Credential Access</td> <!-- Meow T1 -->
        <td rowspan="1">Brute Force</td>
        <td rowspan="1">Password Guessing</td> 
        <td rowspan="1"></td>
    </tr> 
    <tr style="border-left: 2px solid black;border-right: 2px solid black;background: none;"> <!-- Meow T2 -->
        <td rowspan="1">Discovery</td> 
        <td rowspan="1">Network Service Discovery</td>
        <td rowspan="1"></td>
        <td rowspan="1">Nmap</td> 
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;background: none;"> <!-- Meow T3 -->
        <td rowspan="2">Initial Access</td> 
        <td rowspan="1">Exploit Public-Facing Application</td>
        <td rowspan="2"></td>
        <td rowspan="2">Telnet</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;background: none;">
        <td rowspan="1">Valid Accounts</td>
    </tr>
    <tr style="border-top: 4px solid black;border-left: 2px solid black;border-right: 2px solid black;background: none;"> <!-- Start Mongod -->
        <td rowspan="2"><a href="Mongod/">Mongod</a></td>
        <td rowspan="2"><a href="/">Starting Point Tier 0</a></td>
        <td rowspan="2">Very Easy</td>
        <td rowspan="2">Linux</td>
        <td rowspan="1">Collection</td>
        <td rowspan="1">Data from Information Repositories</td>
        <td rowspan="1">Data from Local System</td>
        <td rowspan="1">MongoDB</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;background: none;">
        <td rowspan="1">Discovery</td>
        <td rowspan="1">Network Service Discovery</td>
        <td rowspan="1"></td>
        <td rowspan="1">Nmap</td> 
    </tr>
    </tr>
    <tr style="border-top: 4px solid black;border-left: 2px solid black;border-right: 2px solid black;background: none;"> <!-- Start Preignition -->
        <td rowspan="3"><a href="Preignition/">Preignition</a></td>
        <td rowspan="3"><a href="/">Starting Point Tier 0</a></td>
        <td rowspan="3">Very Easy</td>
        <td rowspan="3">Linux</td>
        <td rowspan="1">Command and Control</td>
        <td rowspan="1">Application Layer Protocol</td>
        <td rowspan="1">Web Protocols</td>
        <td rowspan="1">Curl</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;background: none;">
        <td rowspan="2">Discovery</td>
        <td rowspan="1">File and Directory Discovery</td>
        <td rowspan="1"></td>
        <td rowspan="1">Gobuster</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;background: none;">
        <td rowspan="1">Network Service Discovery</td>
        <td rowspan="1"></td>
        <td rowspan="1">Nmap</td>
    </tr>
    <tr style="border-top: 4px solid black;border-left: 2px solid black;border-right: 2px solid black;background: none;"> <!-- Start Redeemer -->
        <td rowspan="2"><a href="Redeemer/">Redeemer</a></td>
        <td rowspan="2"><a href="/">Starting Point Tier 0</a></td>
        <td rowspan="2">Very Easy</td>
        <td rowspan="2">Linux</td>
        <td rowspan="1">Collection</td>
        <td rowspan="1">Data from Information Repositories</td>
        <td rowspan="1">Data from Local System</td>
        <td rowspan="1">Redis</td>
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;background: none;">
        <td rowspan="1">Discovery</td>
        <td rowspan="1">Network Service Discovery</td>
        <td rowspan="1"></td>
        <td rowspan="1">Nmap</td> 
    </tr>
    <tr style="border-top: 4px solid black;border-left: 2px solid black;border-right: 2px solid black;background: none;"> <!-- Start Synced -->
        <td rowspan="3"><a href="Synced/">Synced</a></td>
        <td rowspan="3"><a href="/">Starting Point Tier 0</a></td>
        <td rowspan="3">Very Easy</td>
        <td rowspan="3">Linux</td>
        <td rowspan="1">Data from Information Repositories</td>
        <td rowspan="1"></td>
        <td rowspan="1"></td>
        <td rowspan="1">rsync</td>
    </tr>
     <tr style="border-left: 2px solid black;border-right: 2px solid black;background: none;">
        <td rowspan="1">Discovery</td>
        <td rowspan="1">Network Share Discovery</td>
        <td rowspan="1"></td>
        <td rowspan="1">Nmap</td> 
    </tr>
    <tr style="border-left: 2px solid black;border-right: 2px solid black;background: none;">
        <td rowspan="2">Initial Access</td>
        <td rowspan="1">Valid Accounts</td> 
        <td rowspan="1">Default Accounts</td>
        <td rowspan="2">rsync</td>
    </tr>
</table>
