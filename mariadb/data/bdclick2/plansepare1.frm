TYPE=VIEW
query=(select `bdclick2`.`bdplansepare`.`idFactura` AS `idFactura`,`bdclick2`.`bdplansepare`.`producto` AS `producto`,`bdclick2`.`bdplansepare`.`lista` AS `lista`,`bdclick2`.`bdplansepare`.`cantidad` AS `cantidad`,`bdclick2`.`bdplansepare`.`anulada` AS `anulada`,`bdclick2`.`bdplansepare`.`estado2` AS `estado2`,`bdclick2`.`bdplansepare`.`bodega` AS `bodega` from `bdclick2`.`bdplansepare` where ((`bdclick2`.`bdplansepare`.`anulada` = 0) and (`bdclick2`.`bdplansepare`.`estado2` = \'\')))
md5=5488ecd24d508debfe98fa49bbce6b4c
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:46
create-version=2
source=(select `bdplansepare`.`idFactura` AS `idFactura`,`bdplansepare`.`producto` AS `producto`,`bdplansepare`.`lista` AS `lista`,`bdplansepare`.`cantidad` AS `cantidad`,`bdplansepare`.`anulada` AS `anulada`,`bdplansepare`.`estado2` AS `estado2`,`bdplansepare`.`bodega` AS `bodega` from `bdplansepare` where ((`bdplansepare`.`anulada` = 0) and (`bdplansepare`.`estado2` = \'\')))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`bdplansepare`.`idFactura` AS `idFactura`,`bdclick2`.`bdplansepare`.`producto` AS `producto`,`bdclick2`.`bdplansepare`.`lista` AS `lista`,`bdclick2`.`bdplansepare`.`cantidad` AS `cantidad`,`bdclick2`.`bdplansepare`.`anulada` AS `anulada`,`bdclick2`.`bdplansepare`.`estado2` AS `estado2`,`bdclick2`.`bdplansepare`.`bodega` AS `bodega` from `bdclick2`.`bdplansepare` where ((`bdclick2`.`bdplansepare`.`anulada` = 0) and (`bdclick2`.`bdplansepare`.`estado2` = \'\')))
mariadb-version=100135
