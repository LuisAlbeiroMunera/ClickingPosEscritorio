TYPE=VIEW
query=(select `bdclick4`.`bdplansepare`.`idFactura` AS `idFactura`,`bdclick4`.`bdplansepare`.`producto` AS `producto`,`bdclick4`.`bdplansepare`.`lista` AS `lista`,`bdclick4`.`bdplansepare`.`cantidad` AS `cantidad`,`bdclick4`.`bdplansepare`.`anulada` AS `anulada`,`bdclick4`.`bdplansepare`.`estado2` AS `estado2`,`bdclick4`.`bdplansepare`.`bodega` AS `bodega` from `bdclick4`.`bdplansepare` where ((`bdclick4`.`bdplansepare`.`anulada` = 0) and (`bdclick4`.`bdplansepare`.`estado2` = \'\')))
md5=68bc5fd59a1cd54aeb5aa42f00293531
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:29
create-version=2
source=(select `bdplansepare`.`idFactura` AS `idFactura`,`bdplansepare`.`producto` AS `producto`,`bdplansepare`.`lista` AS `lista`,`bdplansepare`.`cantidad` AS `cantidad`,`bdplansepare`.`anulada` AS `anulada`,`bdplansepare`.`estado2` AS `estado2`,`bdplansepare`.`bodega` AS `bodega` from `bdplansepare` where ((`bdplansepare`.`anulada` = 0) and (`bdplansepare`.`estado2` = \'\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdplansepare`.`idFactura` AS `idFactura`,`bdclick4`.`bdplansepare`.`producto` AS `producto`,`bdclick4`.`bdplansepare`.`lista` AS `lista`,`bdclick4`.`bdplansepare`.`cantidad` AS `cantidad`,`bdclick4`.`bdplansepare`.`anulada` AS `anulada`,`bdclick4`.`bdplansepare`.`estado2` AS `estado2`,`bdclick4`.`bdplansepare`.`bodega` AS `bodega` from `bdclick4`.`bdplansepare` where ((`bdclick4`.`bdplansepare`.`anulada` = 0) and (`bdclick4`.`bdplansepare`.`estado2` = \'\')))
mariadb-version=100135
