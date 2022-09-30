TYPE=VIEW
query=(select `bdclick5`.`bdoservicio1`.`idFactura` AS `idFactura`,`bdclick5`.`bdoservicio1`.`producto` AS `producto`,`bdclick5`.`bdoservicio1`.`lista` AS `lista`,`bdclick5`.`bdoservicio1`.`cantidad` AS `cantidad`,`bdclick5`.`bdoservicio1`.`anulada` AS `anulada`,`bdclick5`.`bdoservicio1`.`estado2` AS `estado2`,`bdclick5`.`bdoservicio1`.`bodega` AS `bodega` from `bdclick5`.`bdoservicio1` where ((`bdclick5`.`bdoservicio1`.`anulada` = 0) and (`bdclick5`.`bdoservicio1`.`estado2` = \'\')))
md5=e613d0713cabebf53b53a3e1956e5850
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:48
create-version=2
source=(select `bdoservicio1`.`idFactura` AS `idFactura`,`bdoservicio1`.`producto` AS `producto`,`bdoservicio1`.`lista` AS `lista`,`bdoservicio1`.`cantidad` AS `cantidad`,`bdoservicio1`.`anulada` AS `anulada`,`bdoservicio1`.`estado2` AS `estado2`,`bdoservicio1`.`bodega` AS `bodega` from `bdoservicio1` where ((`bdoservicio1`.`anulada` = 0) and (`bdoservicio1`.`estado2` = \'\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdoservicio1`.`idFactura` AS `idFactura`,`bdclick5`.`bdoservicio1`.`producto` AS `producto`,`bdclick5`.`bdoservicio1`.`lista` AS `lista`,`bdclick5`.`bdoservicio1`.`cantidad` AS `cantidad`,`bdclick5`.`bdoservicio1`.`anulada` AS `anulada`,`bdclick5`.`bdoservicio1`.`estado2` AS `estado2`,`bdclick5`.`bdoservicio1`.`bodega` AS `bodega` from `bdclick5`.`bdoservicio1` where ((`bdclick5`.`bdoservicio1`.`anulada` = 0) and (`bdclick5`.`bdoservicio1`.`estado2` = \'\')))
mariadb-version=100135
