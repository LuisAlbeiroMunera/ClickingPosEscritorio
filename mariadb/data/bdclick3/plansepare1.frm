TYPE=VIEW
query=(select `bdclick3`.`bdplansepare`.`idFactura` AS `idFactura`,`bdclick3`.`bdplansepare`.`producto` AS `producto`,`bdclick3`.`bdplansepare`.`lista` AS `lista`,`bdclick3`.`bdplansepare`.`cantidad` AS `cantidad`,`bdclick3`.`bdplansepare`.`anulada` AS `anulada`,`bdclick3`.`bdplansepare`.`estado2` AS `estado2`,`bdclick3`.`bdplansepare`.`bodega` AS `bodega` from `bdclick3`.`bdplansepare` where ((`bdclick3`.`bdplansepare`.`anulada` = 0) and (`bdclick3`.`bdplansepare`.`estado2` = \'\')))
md5=6621409c2bf51571f1362215a49c284c
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:52
create-version=2
source=(select `bdplansepare`.`idFactura` AS `idFactura`,`bdplansepare`.`producto` AS `producto`,`bdplansepare`.`lista` AS `lista`,`bdplansepare`.`cantidad` AS `cantidad`,`bdplansepare`.`anulada` AS `anulada`,`bdplansepare`.`estado2` AS `estado2`,`bdplansepare`.`bodega` AS `bodega` from `bdplansepare` where ((`bdplansepare`.`anulada` = 0) and (`bdplansepare`.`estado2` = \'\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdplansepare`.`idFactura` AS `idFactura`,`bdclick3`.`bdplansepare`.`producto` AS `producto`,`bdclick3`.`bdplansepare`.`lista` AS `lista`,`bdclick3`.`bdplansepare`.`cantidad` AS `cantidad`,`bdclick3`.`bdplansepare`.`anulada` AS `anulada`,`bdclick3`.`bdplansepare`.`estado2` AS `estado2`,`bdclick3`.`bdplansepare`.`bodega` AS `bodega` from `bdclick3`.`bdplansepare` where ((`bdclick3`.`bdplansepare`.`anulada` = 0) and (`bdclick3`.`bdplansepare`.`estado2` = \'\')))
mariadb-version=100135
