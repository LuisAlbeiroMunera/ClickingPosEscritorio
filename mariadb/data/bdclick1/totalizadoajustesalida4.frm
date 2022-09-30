TYPE=VIEW
query=select `bdclick1`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega4` left join `bdclick1`.`ajustessalida` on((`bdclick1`.`bdproductosbodega4`.`idSistema` = `ajustessalida`.`producto`))) where (`ajustessalida`.`bodega` = \'BODEGA-4\') group by `bdclick1`.`bdproductosbodega4`.`idSistema`
md5=48f33fdc1ad33018e33cff8a6dce4014
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:38
create-version=2
source=select `bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdproductosbodega4` left join `ajustessalida` on((`bdproductosbodega4`.`idSistema` = `ajustessalida`.`producto`))) where (`ajustessalida`.`bodega` = \'BODEGA-4\') group by `bdproductosbodega4`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`ajustessalida`.`cantidad`),\'0\',`ajustessalida`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega4` left join `bdclick1`.`ajustessalida` on((`bdclick1`.`bdproductosbodega4`.`idSistema` = `ajustessalida`.`producto`))) where (`ajustessalida`.`bodega` = \'BODEGA-4\') group by `bdclick1`.`bdproductosbodega4`.`idSistema`
mariadb-version=100135
