TYPE=VIEW
query=(select `bdclick1`.`bdplansepare`.`idFactura` AS `idFactura`,`bdclick1`.`bdplansepare`.`producto` AS `producto`,`bdclick1`.`bdplansepare`.`lista` AS `lista`,`bdclick1`.`bdplansepare`.`cantidad` AS `cantidad`,`bdclick1`.`bdplansepare`.`anulada` AS `anulada`,`bdclick1`.`bdplansepare`.`estado2` AS `estado2`,`bdclick1`.`bdplansepare`.`bodega` AS `bodega` from `bdclick1`.`bdplansepare` where ((`bdclick1`.`bdplansepare`.`anulada` = 0) and (`bdclick1`.`bdplansepare`.`estado2` = \'\')))
md5=81ef6e15f3a9dda4be6e76d1d778ebac
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:36
create-version=2
source=(select `bdplansepare`.`idFactura` AS `idFactura`,`bdplansepare`.`producto` AS `producto`,`bdplansepare`.`lista` AS `lista`,`bdplansepare`.`cantidad` AS `cantidad`,`bdplansepare`.`anulada` AS `anulada`,`bdplansepare`.`estado2` AS `estado2`,`bdplansepare`.`bodega` AS `bodega` from `bdplansepare` where ((`bdplansepare`.`anulada` = 0) and (`bdplansepare`.`estado2` = \'\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick1`.`bdplansepare`.`idFactura` AS `idFactura`,`bdclick1`.`bdplansepare`.`producto` AS `producto`,`bdclick1`.`bdplansepare`.`lista` AS `lista`,`bdclick1`.`bdplansepare`.`cantidad` AS `cantidad`,`bdclick1`.`bdplansepare`.`anulada` AS `anulada`,`bdclick1`.`bdplansepare`.`estado2` AS `estado2`,`bdclick1`.`bdplansepare`.`bodega` AS `bodega` from `bdclick1`.`bdplansepare` where ((`bdclick1`.`bdplansepare`.`anulada` = 0) and (`bdclick1`.`bdplansepare`.`estado2` = \'\')))
mariadb-version=100135
