TYPE=VIEW
query=select `bdclick`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick`.`bdfactura`.`cantidad`),\'0\',`bdclick`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductosbodega3` left join `bdclick`.`bdfactura` on((`bdclick`.`bdfactura`.`producto` = `bdclick`.`bdproductosbodega3`.`idSistema`))) where (`bdclick`.`bdfactura`.`bodega` = \'BODEGA-3\') group by `bdclick`.`bdproductosbodega3`.`idSistema`
md5=8f5aa0f2c3b49f92c89dca1b768605d0
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:30
create-version=2
source=select `bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`bdfactura`.`cantidad`),\'0\',`bdfactura`.`cantidad`)) AS `Expr1` from (`bdproductosbodega3` left join `bdfactura` on((`bdfactura`.`producto` = `bdproductosbodega3`.`idSistema`))) where (`bdfactura`.`bodega` = \'BODEGA-3\') group by `bdproductosbodega3`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick`.`bdfactura`.`cantidad`),\'0\',`bdclick`.`bdfactura`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductosbodega3` left join `bdclick`.`bdfactura` on((`bdclick`.`bdfactura`.`producto` = `bdclick`.`bdproductosbodega3`.`idSistema`))) where (`bdclick`.`bdfactura`.`bodega` = \'BODEGA-3\') group by `bdclick`.`bdproductosbodega3`.`idSistema`
mariadb-version=100135
