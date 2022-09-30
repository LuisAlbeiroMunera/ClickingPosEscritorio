TYPE=VIEW
query=(select `bdclick`.`bdcxc`.`factura2` AS `fact`,`bdclick`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick`.`bdcxc`.`valor`) AS `valor`,`bdclick`.`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`bdclick`.`bdverificadorfacturas`.`terminal` AS `terminal`,`bdclick`.`bdverificadorfacturas`.`placa` AS `placa` from (`bdclick`.`bdcxc` left join `bdclick`.`bdverificadorfacturas` on((`bdclick`.`bdcxc`.`factura2` = `bdclick`.`bdverificadorfacturas`.`factura`))) group by `bdclick`.`bdcxc`.`factura`,`bdclick`.`bdcxc`.`tipo`,`bdclick`.`bdcxc`.`estado`,\'\',`bdclick`.`bdverificadorfacturas`.`terminal`,`bdclick`.`bdverificadorfacturas`.`placa` having ((`bdclick`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick`.`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
md5=252975dd4c0a2efdc5937de72bebdc4c
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-06 16:18:56
create-version=2
source=(\nselect\n  `bdcxc`.`factura2`                  AS `fact`,\n  `bdcxc`.`tipo`                     AS `tipo`,\n  sum(`bdcxc`.`valor`)               AS `valor`,\n  `bdcxc`.`estado`                   AS `estado`,\n  \'\'                                 AS `factura`,\n  `bdverificadorfacturas`.`terminal` AS `terminal`,\n  `bdverificadorfacturas`.`placa`    AS `placa`\nfrom (`bdcxc`\n   left join `bdverificadorfacturas`\n     on ((`bdcxc`.`factura2` = `bdverificadorfacturas`.`factura`)))\ngroup by `bdcxc`.`factura`,`bdcxc`.`tipo`,`bdcxc`.`estado`,\'\',`bdverificadorfacturas`.`terminal`,`bdverificadorfacturas`.`placa`\nhaving ((`bdcxc`.`tipo` = \'ABONO\')\n        and (`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdcxc`.`factura2` AS `fact`,`bdclick`.`bdcxc`.`tipo` AS `tipo`,sum(`bdclick`.`bdcxc`.`valor`) AS `valor`,`bdclick`.`bdcxc`.`estado` AS `estado`,\'\' AS `factura`,`bdclick`.`bdverificadorfacturas`.`terminal` AS `terminal`,`bdclick`.`bdverificadorfacturas`.`placa` AS `placa` from (`bdclick`.`bdcxc` left join `bdclick`.`bdverificadorfacturas` on((`bdclick`.`bdcxc`.`factura2` = `bdclick`.`bdverificadorfacturas`.`factura`))) group by `bdclick`.`bdcxc`.`factura`,`bdclick`.`bdcxc`.`tipo`,`bdclick`.`bdcxc`.`estado`,\'\',`bdclick`.`bdverificadorfacturas`.`terminal`,`bdclick`.`bdverificadorfacturas`.`placa` having ((`bdclick`.`bdcxc`.`tipo` = \'ABONO\') and (`bdclick`.`bdcxc`.`estado` = \'ABONO-REALIZADO\')))
mariadb-version=100135
