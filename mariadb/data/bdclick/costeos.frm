TYPE=VIEW
query=select `bdclick`.`bdcosteo`.`Id` AS `Id`,`bdclick`.`bdcosteo`.`fecha` AS `fecha`,`bdclick`.`bdcosteo`.`total` AS `total`,`bdclick`.`bdcosteo`.`usuario` AS `usuario`,`bdclick`.`bdcosteo`.`unidades` AS `unidades`,`bdclick`.`bdcosteo`.`tipo` AS `tipo`,`bdclick`.`bdcosteo`.`producto` AS `producto`,`bdclick`.`bdcosteo`.`anulada` AS `anulada`,`bdclick`.`bdcosteo`.`bodega` AS `bodega` from `bdclick`.`bdcosteo` where (`bdclick`.`bdcosteo`.`anulada` = \'0\')
md5=a25462d614d93e7e2977d974a948d006
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:23
create-version=2
source=select `bdcosteo`.`Id` AS `Id`,`bdcosteo`.`fecha` AS `fecha`,`bdcosteo`.`total` AS `total`,`bdcosteo`.`usuario` AS `usuario`,`bdcosteo`.`unidades` AS `unidades`,`bdcosteo`.`tipo` AS `tipo`,`bdcosteo`.`producto` AS `producto`,`bdcosteo`.`anulada` AS `anulada`,`bdcosteo`.`bodega` AS `bodega` from `bdcosteo` where (`bdcosteo`.`anulada` = \'0\')
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdcosteo`.`Id` AS `Id`,`bdclick`.`bdcosteo`.`fecha` AS `fecha`,`bdclick`.`bdcosteo`.`total` AS `total`,`bdclick`.`bdcosteo`.`usuario` AS `usuario`,`bdclick`.`bdcosteo`.`unidades` AS `unidades`,`bdclick`.`bdcosteo`.`tipo` AS `tipo`,`bdclick`.`bdcosteo`.`producto` AS `producto`,`bdclick`.`bdcosteo`.`anulada` AS `anulada`,`bdclick`.`bdcosteo`.`bodega` AS `bodega` from `bdclick`.`bdcosteo` where (`bdclick`.`bdcosteo`.`anulada` = \'0\')
mariadb-version=100135
