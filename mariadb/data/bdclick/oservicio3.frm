TYPE=VIEW
query=(select `bdclick`.`bdoservicio1`.`idFactura` AS `idFactura`,`bdclick`.`bdoservicio1`.`producto` AS `producto`,`bdclick`.`bdoservicio1`.`lista` AS `lista`,`bdclick`.`bdoservicio1`.`cantidad` AS `cantidad`,`bdclick`.`bdoservicio1`.`anulada` AS `anulada`,`bdclick`.`bdoservicio1`.`estado2` AS `estado2`,`bdclick`.`bdoservicio1`.`bodega` AS `bodega` from `bdclick`.`bdoservicio1` where ((`bdclick`.`bdoservicio1`.`anulada` = 0) and (`bdclick`.`bdoservicio1`.`estado2` = \'\')))
md5=3a8663fca01d963f362be2db51abb1e4
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:25
create-version=2
source=(select `bdoservicio1`.`idFactura` AS `idFactura`,`bdoservicio1`.`producto` AS `producto`,`bdoservicio1`.`lista` AS `lista`,`bdoservicio1`.`cantidad` AS `cantidad`,`bdoservicio1`.`anulada` AS `anulada`,`bdoservicio1`.`estado2` AS `estado2`,`bdoservicio1`.`bodega` AS `bodega` from `bdoservicio1` where ((`bdoservicio1`.`anulada` = 0) and (`bdoservicio1`.`estado2` = \'\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdoservicio1`.`idFactura` AS `idFactura`,`bdclick`.`bdoservicio1`.`producto` AS `producto`,`bdclick`.`bdoservicio1`.`lista` AS `lista`,`bdclick`.`bdoservicio1`.`cantidad` AS `cantidad`,`bdclick`.`bdoservicio1`.`anulada` AS `anulada`,`bdclick`.`bdoservicio1`.`estado2` AS `estado2`,`bdclick`.`bdoservicio1`.`bodega` AS `bodega` from `bdclick`.`bdoservicio1` where ((`bdclick`.`bdoservicio1`.`anulada` = 0) and (`bdclick`.`bdoservicio1`.`estado2` = \'\')))
mariadb-version=100135
