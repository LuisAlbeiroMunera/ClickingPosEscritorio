TYPE=VIEW
query=select `bdclick5`.`bdcosteo`.`Id` AS `Id`,`bdclick5`.`bdcosteo`.`fecha` AS `fecha`,`bdclick5`.`bdcosteo`.`total` AS `total`,`bdclick5`.`bdcosteo`.`usuario` AS `usuario`,`bdclick5`.`bdcosteo`.`unidades` AS `unidades`,`bdclick5`.`bdcosteo`.`tipo` AS `tipo`,`bdclick5`.`bdcosteo`.`producto` AS `producto`,`bdclick5`.`bdcosteo`.`anulada` AS `anulada`,`bdclick5`.`bdcosteo`.`bodega` AS `bodega` from `bdclick5`.`bdcosteo` where (`bdclick5`.`bdcosteo`.`anulada` = \'0\')
md5=cbfb2564a9b3943143869880e62f1c65
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:46
create-version=2
source=select `bdcosteo`.`Id` AS `Id`,`bdcosteo`.`fecha` AS `fecha`,`bdcosteo`.`total` AS `total`,`bdcosteo`.`usuario` AS `usuario`,`bdcosteo`.`unidades` AS `unidades`,`bdcosteo`.`tipo` AS `tipo`,`bdcosteo`.`producto` AS `producto`,`bdcosteo`.`anulada` AS `anulada`,`bdcosteo`.`bodega` AS `bodega` from `bdcosteo` where (`bdcosteo`.`anulada` = \'0\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdcosteo`.`Id` AS `Id`,`bdclick5`.`bdcosteo`.`fecha` AS `fecha`,`bdclick5`.`bdcosteo`.`total` AS `total`,`bdclick5`.`bdcosteo`.`usuario` AS `usuario`,`bdclick5`.`bdcosteo`.`unidades` AS `unidades`,`bdclick5`.`bdcosteo`.`tipo` AS `tipo`,`bdclick5`.`bdcosteo`.`producto` AS `producto`,`bdclick5`.`bdcosteo`.`anulada` AS `anulada`,`bdclick5`.`bdcosteo`.`bodega` AS `bodega` from `bdclick5`.`bdcosteo` where (`bdclick5`.`bdcosteo`.`anulada` = \'0\')
mariadb-version=100135
