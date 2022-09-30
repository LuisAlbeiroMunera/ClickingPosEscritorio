TYPE=VIEW
query=select `bdclick`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick`.`bdfactura`.`cantidad`),\'0\',`bdclick`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductosbodega1` left join `bdclick`.`bdfactura` on((`bdclick`.`bdfactura`.`producto` = `bdclick`.`bdproductosbodega1`.`idSistema`))) where (`bdclick`.`bdfactura`.`bodega` = \'BODEGA-1\') group by `bdclick`.`bdproductosbodega1`.`idSistema`
md5=51ba835cec26cac112941b119b331b68
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:30
create-version=2
source=select `bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`bdfactura`.`cantidad`),\'0\',`bdfactura`.`cantidad`)) AS `Expr1` from (`bdproductosbodega1` left join `bdfactura` on((`bdfactura`.`producto` = `bdproductosbodega1`.`idSistema`))) where (`bdfactura`.`bodega` = \'BODEGA-1\') group by `bdproductosbodega1`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick`.`bdfactura`.`cantidad`),\'0\',`bdclick`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductosbodega1` left join `bdclick`.`bdfactura` on((`bdclick`.`bdfactura`.`producto` = `bdclick`.`bdproductosbodega1`.`idSistema`))) where (`bdclick`.`bdfactura`.`bodega` = \'BODEGA-1\') group by `bdclick`.`bdproductosbodega1`.`idSistema`
mariadb-version=100135
