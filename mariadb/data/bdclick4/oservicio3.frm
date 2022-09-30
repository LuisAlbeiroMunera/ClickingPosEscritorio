TYPE=VIEW
query=(select `bdclick4`.`bdoservicio1`.`idFactura` AS `idFactura`,`bdclick4`.`bdoservicio1`.`producto` AS `producto`,`bdclick4`.`bdoservicio1`.`lista` AS `lista`,`bdclick4`.`bdoservicio1`.`cantidad` AS `cantidad`,`bdclick4`.`bdoservicio1`.`anulada` AS `anulada`,`bdclick4`.`bdoservicio1`.`estado2` AS `estado2`,`bdclick4`.`bdoservicio1`.`bodega` AS `bodega` from `bdclick4`.`bdoservicio1` where ((`bdclick4`.`bdoservicio1`.`anulada` = 0) and (`bdclick4`.`bdoservicio1`.`estado2` = \'\')))
md5=03d785cf45a57f34a232c11c20ea9811
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:28
create-version=2
source=(select `bdoservicio1`.`idFactura` AS `idFactura`,`bdoservicio1`.`producto` AS `producto`,`bdoservicio1`.`lista` AS `lista`,`bdoservicio1`.`cantidad` AS `cantidad`,`bdoservicio1`.`anulada` AS `anulada`,`bdoservicio1`.`estado2` AS `estado2`,`bdoservicio1`.`bodega` AS `bodega` from `bdoservicio1` where ((`bdoservicio1`.`anulada` = 0) and (`bdoservicio1`.`estado2` = \'\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdoservicio1`.`idFactura` AS `idFactura`,`bdclick4`.`bdoservicio1`.`producto` AS `producto`,`bdclick4`.`bdoservicio1`.`lista` AS `lista`,`bdclick4`.`bdoservicio1`.`cantidad` AS `cantidad`,`bdclick4`.`bdoservicio1`.`anulada` AS `anulada`,`bdclick4`.`bdoservicio1`.`estado2` AS `estado2`,`bdclick4`.`bdoservicio1`.`bodega` AS `bodega` from `bdclick4`.`bdoservicio1` where ((`bdclick4`.`bdoservicio1`.`anulada` = 0) and (`bdclick4`.`bdoservicio1`.`estado2` = \'\')))
mariadb-version=100135
