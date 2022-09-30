TYPE=VIEW
query=(select `bdclick5`.`bdplansepare`.`idFactura` AS `idFactura`,`bdclick5`.`bdplansepare`.`producto` AS `producto`,`bdclick5`.`bdplansepare`.`lista` AS `lista`,`bdclick5`.`bdplansepare`.`cantidad` AS `cantidad`,`bdclick5`.`bdplansepare`.`anulada` AS `anulada`,`bdclick5`.`bdplansepare`.`estado2` AS `estado2`,`bdclick5`.`bdplansepare`.`bodega` AS `bodega` from `bdclick5`.`bdplansepare` where ((`bdclick5`.`bdplansepare`.`anulada` = 0) and (`bdclick5`.`bdplansepare`.`estado2` = \'\')))
md5=d2f0ae357760909ba93be1955aee68a6
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:48
create-version=2
source=(select `bdplansepare`.`idFactura` AS `idFactura`,`bdplansepare`.`producto` AS `producto`,`bdplansepare`.`lista` AS `lista`,`bdplansepare`.`cantidad` AS `cantidad`,`bdplansepare`.`anulada` AS `anulada`,`bdplansepare`.`estado2` AS `estado2`,`bdplansepare`.`bodega` AS `bodega` from `bdplansepare` where ((`bdplansepare`.`anulada` = 0) and (`bdplansepare`.`estado2` = \'\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdplansepare`.`idFactura` AS `idFactura`,`bdclick5`.`bdplansepare`.`producto` AS `producto`,`bdclick5`.`bdplansepare`.`lista` AS `lista`,`bdclick5`.`bdplansepare`.`cantidad` AS `cantidad`,`bdclick5`.`bdplansepare`.`anulada` AS `anulada`,`bdclick5`.`bdplansepare`.`estado2` AS `estado2`,`bdclick5`.`bdplansepare`.`bodega` AS `bodega` from `bdclick5`.`bdplansepare` where ((`bdclick5`.`bdplansepare`.`anulada` = 0) and (`bdclick5`.`bdplansepare`.`estado2` = \'\')))
mariadb-version=100135
